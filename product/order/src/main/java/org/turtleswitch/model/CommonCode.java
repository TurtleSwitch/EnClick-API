package org.turtleswitch.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name="COMMON_CODE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommonCode {

    @Id
    @Column(name="COMM_CD")
    private String commCd;
    @Column(name="COMM_NM")
    private String commNm;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="COMM_CD", referencedColumnName="PARE_CD")
//    private CommonCode parent;

    @Column(name="PARE_CD")
    private String pareCd;
    @Column(name="SORT")
    private int sort;
    @Column(name="USED_YN")
    private char usedYn;
    @Column(name="REMA")
    private String rema;
    @Column(name="REGI_ID")
    private String regiId;
    @Column(name="REGI_DT", updatable=false)
    @CreationTimestamp
    private LocalDateTime regiDt;
    @Column(name="UPDA_ID")
    private String updaId;
    @Column(name="UPDA_DT", insertable=false)
    @UpdateTimestamp
    private LocalDateTime updaDt;
}
