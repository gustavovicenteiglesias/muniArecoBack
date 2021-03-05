package com.muni.model;

public class BotonDePago {
	private Integer nro_transaccion;
	private Double monto_total;
	private Integer cuota ;
	private Integer anio;
	private String descripcion;
	private String cuim;
	private Integer id;
	public BotonDePago(Integer nro_transaccion, Double monto_total, Integer cuota, Integer anio, String descripcion,
			String cuim, Integer id) {
		super();
		this.nro_transaccion = nro_transaccion;
		this.monto_total = monto_total;
		this.cuota = cuota;
		this.anio = anio;
		this.descripcion = descripcion;
		this.cuim = cuim;
		this.id = id;
	}
	public BotonDePago() {
		super();
	}
	public Integer getNro_transaccion() {
		return nro_transaccion;
	}
	public void setNro_transaccion(Integer nro_transaccion) {
		this.nro_transaccion = nro_transaccion;
	}
	public Double getMonto_total() {
		return monto_total;
	}
	public void setMonto_total(Double monto_total) {
		this.monto_total = monto_total;
	}
	public Integer getCuota() {
		return cuota;
	}
	public void setCuota(Integer cuota) {
		this.cuota = cuota;
	}
	public Integer getAnio() {
		return anio;
	}
	public void setAnio(Integer anio) {
		this.anio = anio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCuim() {
		return cuim;
	}
	public void setCuim(String cuim) {
		this.cuim = cuim;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "BotonDePago [nro_transaccion=" + nro_transaccion + ", monto_total=" + monto_total + ", cuota=" + cuota
				+ ", anio=" + anio + ", descripcion=" + descripcion + ", cuim=" + cuim + ", id=" + id + "]";
	}
	
	
	
	
}
