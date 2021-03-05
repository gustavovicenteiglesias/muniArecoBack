package com.muni.model;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.math.BigInteger;


/**
 * The persistent class for the ing_tmp_rpt_con_mul2_bunica database table.
 * 
 */
@Entity
@Table(name="ing_tmp_rpt_con_mul2_bunica")

public class Bunica implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "id")
	private Integer id;

	private Integer anio;

	private String apynom;

	@Column(name="cod_deleg")
	private Integer codDeleg;

	@Column(name="cod_electronico")
	private String codElectronico;

	@Column(name="cod_municipio")
	private String codMunicipio;

	@Column(name="cod_postal")
	private String codPostal;

	private String cod50anual;

	private String cod50anual2of5;

	private String cod50anualtol;

	private String cod50anualtol2of5;

	private String cod50cuota;

	private String cod50cuota2of5;

	private String cod50cuotatol;

	private String cod50cuotatol2of5;

	//@Column(name="cuenta_ban",nullable = true)
	//private Char cuentaBan;

	private String cuim;

	private Integer cuota;

	private String desccalenanual;

	private String desccalencuota;

	private String descripcion;

	@Column(name="digito_ver")
	private Integer digitoVer;

	@Column(name="dom_full")
	private String domFull;

	@Column(name="dp_calle")
	private String dpCalle;

	@Column(name="dp_cod_calle")
	private String dpCodCalle;

	@Column(name="dp_cod_loc")
	private String dpCodLoc;

	@Column(name="dp_cod_postal")
	private Integer dpCodPostal;

	@Column(name="dp_dept")
	private String dpDept;

	@Column(name="dp_nro")
	private Integer dpNro;

	@Column(name="dp_piso")
	private String dpPiso;

	private String estado;

	
	@Column(name="fecha_emi")
	private Date fechaEmi;

	
	@Column(name="fecha_prox_vto")
	private Date fechaProxVto;

	
	@Column(name="fecha_tol1")
	private Date fechaTol1;

	
	@Column(name="fecha_tol2")
	private Date fechaTol2;

	
	@Column(name="fecha_tol3")
	private Date fechaTol3;

	
	@Column(name="fecha_vto")
	private Date fechaVto;

	
	@Column(name="fecha_vto_anual")
	private Date fechaVtoAnual;

	
	@Column(name="fecha_vto2")
	private Date fechaVto2;

	
	@Column(name="fecha_vto2_anual")
	private Date fechaVto2Anual;

	
	@Column(name="fecha_vto3")
	private Date fechaVto3;

	
	@Column(name="fecha_vto3_anual")
	private Date fechaVto3Anual;
	
	

	private String ivadesc;

	@Column(name="monto_anual")
	private Float montoAnual;

	@Column(name="monto_total")
	private Float montoTotal;

	private Float monto2;

	@Column(name="monto2_anual")
	private Float monto2Anual;

	private Float monto3;

	@Column(name="monto3_anual")
	private Float monto3Anual;

	@Column(name="nro_comprob")
	private BigInteger nroComprob;

	@Column(name="nro_comprob_anual")
	private BigInteger nroComprobAnual;

	@Column(name="nro_contrib")
	private Integer nroContrib;

	@Column(name="pago_anual_dto")
	private Float pagoAnualDto;

	private String recurso;

	@Column(name="tipo_comprob")
	private Integer tipoComprob;

	@Column(name="tipo_comprob_anual")
	private Integer tipoComprobAnual;

	private Integer transaccion;

	private Integer usuario;

	public Bunica() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public String getApynom() {
		return apynom;
	}

	public void setApynom(String apynom) {
		this.apynom = apynom;
	}

	public Integer getCodDeleg() {
		return codDeleg;
	}

	public void setCodDeleg(Integer codDeleg) {
		this.codDeleg = codDeleg;
	}

	public String getCodElectronico() {
		return codElectronico;
	}

	public void setCodElectronico(String codElectronico) {
		this.codElectronico = codElectronico;
	}

	public String getCodMunicipio() {
		return codMunicipio;
	}

	public void setCodMunicipio(String codMunicipio) {
		this.codMunicipio = codMunicipio;
	}

	public String getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	public String getCod50anual() {
		return cod50anual;
	}

	public void setCod50anual(String cod50anual) {
		this.cod50anual = cod50anual;
	}

	public String getCod50anual2of5() {
		return cod50anual2of5;
	}

	public void setCod50anual2of5(String cod50anual2of5) {
		this.cod50anual2of5 = cod50anual2of5;
	}

	public String getCod50anualtol() {
		return cod50anualtol;
	}

	public void setCod50anualtol(String cod50anualtol) {
		this.cod50anualtol = cod50anualtol;
	}

	public String getCod50anualtol2of5() {
		return cod50anualtol2of5;
	}

	public void setCod50anualtol2of5(String cod50anualtol2of5) {
		this.cod50anualtol2of5 = cod50anualtol2of5;
	}

	public String getCod50cuota() {
		return cod50cuota;
	}

	public void setCod50cuota(String cod50cuota) {
		this.cod50cuota = cod50cuota;
	}

	public String getCod50cuota2of5() {
		return cod50cuota2of5;
	}

	public void setCod50cuota2of5(String cod50cuota2of5) {
		this.cod50cuota2of5 = cod50cuota2of5;
	}

	public String getCod50cuotatol() {
		return cod50cuotatol;
	}

	public void setCod50cuotatol(String cod50cuotatol) {
		this.cod50cuotatol = cod50cuotatol;
	}

	public String getCod50cuotatol2of5() {
		return cod50cuotatol2of5;
	}

	public void setCod50cuotatol2of5(String cod50cuotatol2of5) {
		this.cod50cuotatol2of5 = cod50cuotatol2of5;
	}

	public String getCuim() {
		return cuim;
	}

	public void setCuim(String cuim) {
		this.cuim = cuim;
	}

	public Integer getCuota() {
		return cuota;
	}

	public void setCuota(Integer cuota) {
		this.cuota = cuota;
	}

	public String getDesccalenanual() {
		return desccalenanual;
	}

	public void setDesccalenanual(String desccalenanual) {
		this.desccalenanual = desccalenanual;
	}

	public String getDesccalencuota() {
		return desccalencuota;
	}

	public void setDesccalencuota(String desccalencuota) {
		this.desccalencuota = desccalencuota;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getDigitoVer() {
		return digitoVer;
	}

	public void setDigitoVer(Integer digitoVer) {
		this.digitoVer = digitoVer;
	}

	public String getDomFull() {
		return domFull;
	}

	public void setDomFull(String domFull) {
		this.domFull = domFull;
	}

	public String getDpCalle() {
		return dpCalle;
	}

	public void setDpCalle(String dpCalle) {
		this.dpCalle = dpCalle;
	}

	public String getDpCodCalle() {
		return dpCodCalle;
	}

	public void setDpCodCalle(String dpCodCalle) {
		this.dpCodCalle = dpCodCalle;
	}

	public String getDpCodLoc() {
		return dpCodLoc;
	}

	public void setDpCodLoc(String dpCodLoc) {
		this.dpCodLoc = dpCodLoc;
	}

	public Integer getDpCodPostal() {
		return dpCodPostal;
	}

	public void setDpCodPostal(Integer dpCodPostal) {
		this.dpCodPostal = dpCodPostal;
	}

	public String getDpDept() {
		return dpDept;
	}

	public void setDpDept(String dpDept) {
		this.dpDept = dpDept;
	}

	public Integer getDpNro() {
		return dpNro;
	}

	public void setDpNro(Integer dpNro) {
		this.dpNro = dpNro;
	}

	public String getDpPiso() {
		return dpPiso;
	}

	public void setDpPiso(String dpPiso) {
		this.dpPiso = dpPiso;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaEmi() {
		return fechaEmi;
	}

	public void setFechaEmi(Date fechaEmi) {
		this.fechaEmi = fechaEmi;
	}

	public Date getFechaProxVto() {
		return fechaProxVto;
	}

	public void setFechaProxVto(Date fechaProxVto) {
		this.fechaProxVto = fechaProxVto;
	}

	public Date getFechaTol1() {
		return fechaTol1;
	}

	public void setFechaTol1(Date fechaTol1) {
		this.fechaTol1 = fechaTol1;
	}

	public Date getFechaTol2() {
		return fechaTol2;
	}

	public void setFechaTol2(Date fechaTol2) {
		this.fechaTol2 = fechaTol2;
	}

	public Date getFechaTol3() {
		return fechaTol3;
	}

	public void setFechaTol3(Date fechaTol3) {
		this.fechaTol3 = fechaTol3;
	}

	public Date getFechaVto() {
		return fechaVto;
	}

	public void setFechaVto(Date fechaVto) {
		this.fechaVto = fechaVto;
	}

	public Date getFechaVtoAnual() {
		return fechaVtoAnual;
	}

	public void setFechaVtoAnual(Date fechaVtoAnual) {
		this.fechaVtoAnual = fechaVtoAnual;
	}

	public Date getFechaVto2() {
		return fechaVto2;
	}

	public void setFechaVto2(Date fechaVto2) {
		this.fechaVto2 = fechaVto2;
	}

	public Date getFechaVto2Anual() {
		return fechaVto2Anual;
	}

	public void setFechaVto2Anual(Date fechaVto2Anual) {
		this.fechaVto2Anual = fechaVto2Anual;
	}

	public Date getFechaVto3() {
		return fechaVto3;
	}

	public void setFechaVto3(Date fechaVto3) {
		this.fechaVto3 = fechaVto3;
	}

	public Date getFechaVto3Anual() {
		return fechaVto3Anual;
	}

	public void setFechaVto3Anual(Date fechaVto3Anual) {
		this.fechaVto3Anual = fechaVto3Anual;
	}

	public String getIvadesc() {
		return ivadesc;
	}

	public void setIvadesc(String ivadesc) {
		this.ivadesc = ivadesc;
	}

	public Float getMontoAnual() {
		return montoAnual;
	}

	public void setMontoAnual(Float montoAnual) {
		this.montoAnual = montoAnual;
	}

	public Float getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(Float montoTotal) {
		this.montoTotal = montoTotal;
	}

	public Float getMonto2() {
		return monto2;
	}

	public void setMonto2(Float monto2) {
		this.monto2 = monto2;
	}

	public Float getMonto2Anual() {
		return monto2Anual;
	}

	public void setMonto2Anual(Float monto2Anual) {
		this.monto2Anual = monto2Anual;
	}

	public Float getMonto3() {
		return monto3;
	}

	public void setMonto3(Float monto3) {
		this.monto3 = monto3;
	}

	public Float getMonto3Anual() {
		return monto3Anual;
	}

	public void setMonto3Anual(Float monto3Anual) {
		this.monto3Anual = monto3Anual;
	}

	public BigInteger getNroComprob() {
		return nroComprob;
	}

	public void setNroComprob(BigInteger nroComprob) {
		this.nroComprob = nroComprob;
	}

	public BigInteger getNroComprobAnual() {
		return nroComprobAnual;
	}

	public void setNroComprobAnual(BigInteger nroComprobAnual) {
		this.nroComprobAnual = nroComprobAnual;
	}

	public Integer getNroContrib() {
		return nroContrib;
	}

	public void setNroContrib(Integer nroContrib) {
		this.nroContrib = nroContrib;
	}

	public Float getPagoAnualDto() {
		return pagoAnualDto;
	}

	public void setPagoAnualDto(Float pagoAnualDto) {
		this.pagoAnualDto = pagoAnualDto;
	}

	public String getRecurso() {
		return recurso;
	}

	public void setRecurso(String recurso) {
		this.recurso = recurso;
	}

	public Integer getTipoComprob() {
		return tipoComprob;
	}

	public void setTipoComprob(Integer tipoComprob) {
		this.tipoComprob = tipoComprob;
	}

	public Integer getTipoComprobAnual() {
		return tipoComprobAnual;
	}

	public void setTipoComprobAnual(Integer tipoComprobAnual) {
		this.tipoComprobAnual = tipoComprobAnual;
	}

	public Integer getTransaccion() {
		return transaccion;
	}

	public void setTransaccion(Integer transaccion) {
		this.transaccion = transaccion;
	}

	public Integer getUsuario() {
		return usuario;
	}

	public void setUsuario(Integer usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Bunica [id=" + id + ", anio=" + anio + ", apynom=" + apynom + ", codDeleg=" + codDeleg
				+ ", codElectronico=" + codElectronico + ", codMunicipio=" + codMunicipio + ", codPostal=" + codPostal
				+ ", cod50anual=" + cod50anual + ", cod50anual2of5=" + cod50anual2of5 + ", cod50anualtol="
				+ cod50anualtol + ", cod50anualtol2of5=" + cod50anualtol2of5 + ", cod50cuota=" + cod50cuota
				+ ", cod50cuota2of5=" + cod50cuota2of5 + ", cod50cuotatol=" + cod50cuotatol + ", cod50cuotatol2of5="
				+ cod50cuotatol2of5 + ", cuim=" + cuim + ", cuota=" + cuota + ", desccalenanual=" + desccalenanual
				+ ", desccalencuota=" + desccalencuota + ", descripcion=" + descripcion + ", digitoVer=" + digitoVer
				+ ", domFull=" + domFull + ", dpCalle=" + dpCalle + ", dpCodCalle=" + dpCodCalle + ", dpCodLoc="
				+ dpCodLoc + ", dpCodPostal=" + dpCodPostal + ", dpDept=" + dpDept + ", dpNro=" + dpNro + ", dpPiso="
				+ dpPiso + ", estado=" + estado + ", fechaEmi=" + fechaEmi + ", fechaProxVto=" + fechaProxVto
				+ ", fechaTol1=" + fechaTol1 + ", fechaTol2=" + fechaTol2 + ", fechaTol3=" + fechaTol3 + ", fechaVto="
				+ fechaVto + ", fechaVtoAnual=" + fechaVtoAnual + ", fechaVto2=" + fechaVto2 + ", fechaVto2Anual="
				+ fechaVto2Anual + ", fechaVto3=" + fechaVto3 + ", fechaVto3Anual=" + fechaVto3Anual + ", ivadesc="
				+ ivadesc + ", montoAnual=" + montoAnual + ", montoTotal=" + montoTotal + ", monto2=" + monto2
				+ ", monto2Anual=" + monto2Anual + ", monto3=" + monto3 + ", monto3Anual=" + monto3Anual
				+ ", nroComprob=" + nroComprob + ", nroComprobAnual=" + nroComprobAnual + ", nroContrib=" + nroContrib
				+ ", pagoAnualDto=" + pagoAnualDto + ", recurso=" + recurso + ", tipoComprob=" + tipoComprob
				+ ", tipoComprobAnual=" + tipoComprobAnual + ", transaccion=" + transaccion + ", usuario=" + usuario
				+ "]";
	}
	
	

	
	
}