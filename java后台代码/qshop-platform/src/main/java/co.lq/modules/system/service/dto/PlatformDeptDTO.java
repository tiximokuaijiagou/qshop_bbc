package co.lq.modules.system.service.dto;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

/**
 * @author billy
 * @date 2019-03-25
 */
@Data
public class PlatformDeptDTO implements Serializable {

    private Long                  id;

    private String                name;

    @NotNull
    private Boolean               enabled;

    private Long                  pid;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<PlatformDeptDTO> children;

    private Timestamp             createTime;

    public String getLabel() {
        return name;
    }
}
