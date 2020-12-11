package kr.sourcers.pyunggyo.entity;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name="exms_damoa_lecture")
public class Exms_damoa_lecture_entity {
    @Id
    @NotNull
    private Long id;

    @NotNull
    private String lecture_nm;

    @NotNull
    private String area_cd;

    private String org_nm;
    private String edu_fr_dt;
    private String edu_to_dt;
    private String site_url;
    private Long link_id;
    private String isrt_id;
    private String isrt_ip;
    private String isrt_dt;
    private String updt_id;
    private String updt_ip;
    private String updt_dt;

    @Override
    public String toString() {
        return "Exms_damoa_lecture_entity{" +
                "id=" + id +
                ", lecture_nm='" + lecture_nm + '\'' +
                ", area_cd='" + area_cd + '\'' +
                ", org_nm='" + org_nm + '\'' +
                ", edu_fr_dt='" + edu_fr_dt + '\'' +
                ", edu_to_dt='" + edu_to_dt + '\'' +
                ", site_url='" + site_url + '\'' +
                ", link_id=" + link_id +
                ", isrt_id='" + isrt_id + '\'' +
                ", isrt_ip='" + isrt_ip + '\'' +
                ", isrt_dt='" + isrt_dt + '\'' +
                ", updt_id='" + updt_id + '\'' +
                ", updt_ip='" + updt_ip + '\'' +
                ", updt_dt='" + updt_dt + '\'' +
                '}';
    }
}
