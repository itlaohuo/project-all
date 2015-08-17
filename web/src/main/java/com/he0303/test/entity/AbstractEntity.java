package com.he0303.test.entity;

import java.io.Serializable;

/**
 * @author lhq
 * @version $Id: DUMMY $
 */
public abstract class AbstractEntity<ID extends Serializable> implements Serializable {
	private static final long serialVersionUID = 1L;

	public abstract ID getId();

	public abstract void setId(ID id);


	@Override
	public int hashCode() {
		int hashCode = 17;
		hashCode += (null == getId()) ? 0 : getId().hashCode() * 31;
		return hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (null == obj)
			return false;
		if (this == obj)
			return true;
		if (!getClass().equals(obj.getClass()))
			return false;
		AbstractEntity<?> that = (AbstractEntity<?>) obj;
		return (null == this.getId() ? false : this.getId().equals(that.getId()));
	}
}
