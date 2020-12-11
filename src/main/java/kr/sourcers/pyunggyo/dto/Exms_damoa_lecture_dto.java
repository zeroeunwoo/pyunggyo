package kr.sourcers.pyunggyo.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class Exms_damoa_lecture_dto {
    private String action_flag;
    private Long id;
    private String lecture_nm;
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
        return "Exms_damoa_lecture_dto{" +
                "action_flag='" + action_flag + '\'' +
                ", id=" + id +
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
