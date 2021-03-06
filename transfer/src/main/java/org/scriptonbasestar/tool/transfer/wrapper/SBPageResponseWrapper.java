package org.scriptonbasestar.tool.transfer.wrapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.scriptonbasestar.tool.transfer.dto.SBPageDto;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author archmagece
 * @since 2017-08-28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SBPageResponseWrapper<RESPONSE> {

	public static <RESPONSE> SBPageResponseWrapper<RESPONSE> create() {
		return new SBPageResponseWrapper<RESPONSE>();
	}

	//	@Setter(AccessLevel.PROTECTED)
	private long leadTime;

	public SBPageResponseWrapper<RESPONSE> leadTime(long leadTime) {
		this.leadTime = leadTime;
		return this;
	}

	public SBPageResponseWrapper<RESPONSE> leadTimeCalc(long start, long end) {
		this.leadTime = end - start;
		return this;
	}

	public SBPageResponseWrapper<RESPONSE> leadTimeCalc(long start) {
		this.leadTime = System.currentTimeMillis() - start;
		return this;
	}

	private boolean success = true;

	public SBPageResponseWrapper<RESPONSE> success(Collection<RESPONSE> data) {
		this.data = data;
		this.success = true;
		return this;
	}

	public SBPageResponseWrapper<RESPONSE> fail() {
		success = false;
		return this;
	}

	private String lang;

	public SBPageResponseWrapper<RESPONSE> lang(String lang) {
		this.lang = lang;
		return this;
	}

	private String code;

	public SBPageResponseWrapper<RESPONSE> code(String code) {
		this.code = code;
		return this;
	}

	private String message;

	public SBPageResponseWrapper<RESPONSE> message(String message) {
		this.message = message;
		return this;
	}

	protected Set<Map<String, String>> validationErrorSet = new HashSet<>();

	private Collection<RESPONSE> data;
	private SBPageDto page;

	public SBPageResponseWrapper<RESPONSE> data(Collection<RESPONSE> data) {
		this.data = data;
		this.page = new SBPageDto();
		return this;
	}

	public SBPageResponseWrapper<RESPONSE> data(Collection<RESPONSE> data, SBPageDto page) {
		this.data = data;
		this.page = page;
		return this;
	}
}
