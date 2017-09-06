package com.scriptonbasestar.tool.data.mongo.model.inner.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.PersistenceConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author archmagece
 * @since 2015-06-02-16
 */
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DateTimeScopeInnerModel implements Serializable {
	@PersistenceConstructor
	public DateTimeScopeInnerModel(Date fromDate, Date toDate) {
		//TODO from < to
		//TODO not null
		this.fromDate = fromDate;
		//TODO not null
		this.toDate = toDate;
	}

	private Date fromDate;
	private Date toDate;
}
