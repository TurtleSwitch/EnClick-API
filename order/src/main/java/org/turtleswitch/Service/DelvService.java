package org.turtleswitch.Service;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.turtleswitch.dto.DelvDto.DelvSaveReqDto;
import org.turtleswitch.model.DelvMst;
import org.turtleswitch.model.DelvStatCd;
import org.turtleswitch.model.QDelvMst;
import org.turtleswitch.repository.DelvDtlRepository;
import org.turtleswitch.repository.DelvMstRepository;

import static org.turtleswitch.model.DelvStatCd.*;

@Service
public class DelvService {

    DelvMstRepository mstRepo;
    DelvDtlRepository dtlRepo;

    JPAQueryFactory jq;

    public DelvService(DelvMstRepository mstRepo, DelvDtlRepository dtlRepo, EntityManager em) {
        this.mstRepo = mstRepo;
        this.dtlRepo = dtlRepo;
        this.jq = new JPAQueryFactory(em);
    }

    /**
     * delvMst 저장
     */
    @Transactional
    public DelvMst save(DelvSaveReqDto delvSaveReqDto) {
        return mstRepo.save(DelvMst.builder()
                .orderMstUuid(delvSaveReqDto.getOrderMstUuid())
                .addressUuid(delvSaveReqDto.getAddressUuid())
                .delvCompCd(delvSaveReqDto.getDelvCompCd())
                .delvSeq(findDelvSeq(delvSaveReqDto.getAddressUuid()))
                .trackingId(null)
                .delvStatCd(STANDBY)
                .usedYn("Y")
                .build());
    }

    // TODO uuid를 통해서 적절한 seq를 구한다
    private int findDelvSeq(String addressUuid) {
        return 0;
    }


    @Transactional
    public long stat(DelvStatCd stat, String orderMstUuid) {
        QDelvMst delvMst = QDelvMst.delvMst;
        return jq.update(delvMst)
                .where(delvMst.orderMstUuid.eq(orderMstUuid)) // TODO SEQ도 동시에 조건이 들어가야 한다
                .set(delvMst.delvStatCd, stat)
                .execute();
    }
}
