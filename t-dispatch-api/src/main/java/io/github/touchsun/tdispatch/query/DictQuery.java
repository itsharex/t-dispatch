package io.github.touchsun.tdispatch.query;

import io.github.touchsun.tdispatch.core.base.BaseQuery;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 字典查询
 *
 * @author lee
 * @since 2023/6/2 22:31
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DictQuery extends BaseQuery {

    private String type;
}
