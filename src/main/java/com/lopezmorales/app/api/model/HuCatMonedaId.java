package com.lopezmorales.app.api.model;

import java.io.Serializable;
import java.util.Objects;

public class HuCatMonedaId implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long numCia;
    private String claveMoneda;
    
    public HuCatMonedaId() {
    }

    public HuCatMonedaId(Long numCia, String claveMoneda) {
        this.numCia = numCia;
        this.claveMoneda = claveMoneda;
    }
    
    // Gets and Sets
	public Long getNumCia() {
		return numCia;
	}
	public void setNumCia(Long numCia) {
		this.numCia = numCia;
	}
	public String getClaveMoneda() {
		return claveMoneda;
	}
	public void setClaveMoneda(String claveMoneda) {
		this.claveMoneda = claveMoneda;
	}
    
	// hashCode y equals
	@Override
    public int hashCode() {
        return Objects.hash(numCia, claveMoneda);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        HuCatMonedaId that = (HuCatMonedaId) obj;
        return Objects.equals(numCia, that.numCia) &&
                Objects.equals(claveMoneda, that.claveMoneda);
    }
}
