package com.muni.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the sanear database table.
 * 
 */
@Entity
@Table(name="sanear")
@NamedQuery(name="Sanear.findAll", query="SELECT s FROM Sanear s")
public class Sanear implements Serializable {
	private static final long serialVersionUID = 1L;

	private int anio;

	private String apynom;

	@Column(name="cod_electronico")
	private String codElectronico;

	@Column(name="cod_postal")
	private String codPostal;

	private String cod35anual;

	private String cod35anualtol;

	private String cod35cuota;

	private String cod35cuotatol;

	private String cod50anual;

	private String cod50anualtol;

	private String cod50cuota;

	private String cod50cuotatol;

	private String codbp46anual;

	private String codbp46anualtol;

	private String codbp46cuota;

	private String codbp46cuotatol;

	private String codpf46anual;

	private String codpf46anualtol;

	private String codpf46cuota;

	private String codpf46cuotatol;

	@Column(name="cuenta_ban")
	private int cuentaBan;

	private String cuim;

	private int cuota;

	private String desccalenanual;

	private String desccalencuota;

	@Lob
	private String descripcion;

	@Column(name="digito_ver")
	private int digitoVer;

	@Column(name="dom_full")
	private String domFull;

	@Column(name="dom_full_ubicacion")
	private String domFullUbicacion;

	private String estado;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_emi")
	private Date fechaEmi;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_prox_vto")
	private Date fechaProxVto;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_vto")
	private Date fechaVto;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_vto_anual")
	private Date fechaVtoAnual;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_vto2")
	private Date fechaVto2;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_vto2_anual")
	private Date fechaVto2Anual;
	
	@Id
	private int id;

	private String ivadesc;

	@Column(name="monto_anual")
	private float montoAnual;

	@Column(name="monto_deu")
	private int montoDeu;

	@Column(name="monto_total")
	private float montoTotal;

	private float monto2;

	@Column(name="monto2_anual")
	private float monto2Anual;

	private String mtsfrente;

	private int multipr2;

	private String nomenclatura;

	@Column(name="nro_comprob")
	private BigInteger nroComprob;

	@Column(name="nro_comprob_anual")
	private BigInteger nroComprobAnual;

	@Column(name="nro_inmueble")
	private int nroInmueble;

	@Column(name="par_catastral")
	private int parCatastral;

	private String recurso;

	@Column(name="sup_terreno")
	private int supTerreno;

	@Column(name="tipo_comprob")
	private int tipoComprob;

	@Column(name="tipo_comprob_anual")
	private int tipoComprobAnual;

	private int transaccion;

	private String zona1;

	public Sanear() {
	}

	public int getAnio() {
		return this.anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getApynom() {
		return this.apynom;
	}

	public void setApynom(String apynom) {
		this.apynom = apynom;
	}

	public String getCodElectronico() {
		return this.codElectronico;
	}

	public void setCodElectronico(String codElectronico) {
		this.codElectronico = codElectronico;
	}

	public String getCodPostal() {
		return this.codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	public String getCod35anual() {
		return this.cod35anual;
	}

	public void setCod35anual(String cod35anual) {
		this.cod35anual = cod35anual;
	}

	public String getCod35anualtol() {
		return this.cod35anualtol;
	}

	public void setCod35anualtol(String cod35anualtol) {
		this.cod35anualtol = cod35anualtol;
	}

	public String getCod35cuota() {
		return this.cod35cuota;
	}

	public void setCod35cuota(String cod35cuota) {
		this.cod35cuota = cod35cuota;
	}

	public String getCod35cuotatol() {
		return this.cod35cuotatol;
	}

	public void setCod35cuotatol(String cod35cuotatol) {
		this.cod35cuotatol = cod35cuotatol;
	}

	public String getCod50anual() {
		return this.cod50anual;
	}

	public void setCod50anual(String cod50anual) {
		this.cod50anual = cod50anual;
	}

	public String getCod50anualtol() {
		return this.cod50anualtol;
	}

	public void setCod50anualtol(String cod50anualtol) {
		this.cod50anualtol = cod50anualtol;
	}

	public String getCod50cuota() {
		return this.cod50cuota;
	}

	public void setCod50cuota(String cod50cuota) {
		this.cod50cuota = cod50cuota;
	}

	public String getCod50cuotatol() {
		return this.cod50cuotatol;
	}

	public void setCod50cuotatol(String cod50cuotatol) {
		this.cod50cuotatol = cod50cuotatol;
	}

	public String getCodbp46anual() {
		return this.codbp46anual;
	}

	public void setCodbp46anual(String codbp46anual) {
		this.codbp46anual = codbp46anual;
	}

	public String getCodbp46anualtol() {
		return this.codbp46anualtol;
	}

	public void setCodbp46anualtol(String codbp46anualtol) {
		this.codbp46anualtol = codbp46anualtol;
	}

	public String getCodbp46cuota() {
		return this.codbp46cuota;
	}

	public void setCodbp46cuota(String codbp46cuota) {
		this.codbp46cuota = codbp46cuota;
	}

	public String getCodbp46cuotatol() {
		return this.codbp46cuotatol;
	}

	public void setCodbp46cuotatol(String codbp46cuotatol) {
		this.codbp46cuotatol = codbp46cuotatol;
	}

	public String getCodpf46anual() {
		return this.codpf46anual;
	}

	public void setCodpf46anual(String codpf46anual) {
		this.codpf46anual = codpf46anual;
	}

	public String getCodpf46anualtol() {
		return this.codpf46anualtol;
	}

	public void setCodpf46anualtol(String codpf46anualtol) {
		this.codpf46anualtol = codpf46anualtol;
	}

	public String getCodpf46cuota() {
		return this.codpf46cuota;
	}

	public void setCodpf46cuota(String codpf46cuota) {
		this.codpf46cuota = codpf46cuota;
	}

	public String getCodpf46cuotatol() {
		return this.codpf46cuotatol;
	}

	public void setCodpf46cuotatol(String codpf46cuotatol) {
		this.codpf46cuotatol = codpf46cuotatol;
	}

	public int getCuentaBan() {
		return this.cuentaBan;
	}

	public void setCuentaBan(int cuentaBan) {
		this.cuentaBan = cuentaBan;
	}

	public String getCuim() {
		return this.cuim;
	}

	public void setCuim(String cuim) {
		this.cuim = cuim;
	}

	public int getCuota() {
		return this.cuota;
	}

	public void setCuota(int cuota) {
		this.cuota = cuota;
	}

	public String getDesccalenanual() {
		return this.desccalenanual;
	}

	public void setDesccalenanual(String desccalenanual) {
		this.desccalenanual = desccalenanual;
	}

	public String getDesccalencuota() {
		return this.desccalencuota;
	}

	public void setDesccalencuota(String desccalencuota) {
		this.desccalencuota = desccalencuota;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getDigitoVer() {
		return this.digitoVer;
	}

	public void setDigitoVer(int digitoVer) {
		this.digitoVer = digitoVer;
	}

	public String getDomFull() {
		return this.domFull;
	}

	public void setDomFull(String domFull) {
		this.domFull = domFull;
	}

	public String getDomFullUbicacion() {
		return this.domFullUbicacion;
	}

	public void setDomFullUbicacion(String domFullUbicacion) {
		this.domFullUbicacion = domFullUbicacion;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaEmi() {
		return this.fechaEmi;
	}

	public void setFechaEmi(Date fechaEmi) {
		this.fechaEmi = fechaEmi;
	}

	public Date getFechaProxVto() {
		return this.fechaProxVto;
	}

	public void setFechaProxVto(Date fechaProxVto) {
		this.fechaProxVto = fechaProxVto;
	}

	public Date getFechaVto() {
		return this.fechaVto;
	}

	public void setFechaVto(Date fechaVto) {
		this.fechaVto = fechaVto;
	}

	public Date getFechaVtoAnual() {
		return this.fechaVtoAnual;
	}

	public void setFechaVtoAnual(Date fechaVtoAnual) {
		this.fechaVtoAnual = fechaVtoAnual;
	}

	public Date getFechaVto2() {
		return this.fechaVto2;
	}

	public void setFechaVto2(Date fechaVto2) {
		this.fechaVto2 = fechaVto2;
	}

	public Date getFechaVto2Anual() {
		return this.fechaVto2Anual;
	}

	public void setFechaVto2Anual(Date fechaVto2Anual) {
		this.fechaVto2Anual = fechaVto2Anual;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIvadesc() {
		return this.ivadesc;
	}

	public void setIvadesc(String ivadesc) {
		this.ivadesc = ivadesc;
	}

	public float getMontoAnual() {
		return this.montoAnual;
	}

	public void setMontoAnual(float montoAnual) {
		this.montoAnual = montoAnual;
	}

	public int getMontoDeu() {
		return this.montoDeu;
	}

	public void setMontoDeu(int montoDeu) {
		this.montoDeu = montoDeu;
	}

	public float getMontoTotal() {
		return this.montoTotal;
	}

	public void setMontoTotal(float montoTotal) {
		this.montoTotal = montoTotal;
	}

	public float getMonto2() {
		return this.monto2;
	}

	public void setMonto2(float monto2) {
		this.monto2 = monto2;
	}

	public float getMonto2Anual() {
		return this.monto2Anual;
	}

	public void setMonto2Anual(float monto2Anual) {
		this.monto2Anual = monto2Anual;
	}

	public String getMtsfrente() {
		return this.mtsfrente;
	}

	public void setMtsfrente(String mtsfrente) {
		this.mtsfrente = mtsfrente;
	}

	public int getMultipr2() {
		return this.multipr2;
	}

	public void setMultipr2(int multipr2) {
		this.multipr2 = multipr2;
	}

	public String getNomenclatura() {
		return this.nomenclatura;
	}

	public void setNomenclatura(String nomenclatura) {
		this.nomenclatura = nomenclatura;
	}

	public BigInteger getNroComprob() {
		return this.nroComprob;
	}

	public void setNroComprob(BigInteger nroComprob) {
		this.nroComprob = nroComprob;
	}

	public BigInteger getNroComprobAnual() {
		return this.nroComprobAnual;
	}

	public void setNroComprobAnual(BigInteger nroComprobAnual) {
		this.nroComprobAnual = nroComprobAnual;
	}

	public int getNroInmueble() {
		return this.nroInmueble;
	}

	public void setNroInmueble(int nroInmueble) {
		this.nroInmueble = nroInmueble;
	}

	public int getParCatastral() {
		return this.parCatastral;
	}

	public void setParCatastral(int parCatastral) {
		this.parCatastral = parCatastral;
	}

	public String getRecurso() {
		return this.recurso;
	}

	public void setRecurso(String recurso) {
		this.recurso = recurso;
	}

	public int getSupTerreno() {
		return this.supTerreno;
	}

	public void setSupTerreno(int supTerreno) {
		this.supTerreno = supTerreno;
	}

	public int getTipoComprob() {
		return this.tipoComprob;
	}

	public void setTipoComprob(int tipoComprob) {
		this.tipoComprob = tipoComprob;
	}

	public int getTipoComprobAnual() {
		return this.tipoComprobAnual;
	}

	public void setTipoComprobAnual(int tipoComprobAnual) {
		this.tipoComprobAnual = tipoComprobAnual;
	}

	public int getTransaccion() {
		return this.transaccion;
	}

	public void setTransaccion(int transaccion) {
		this.transaccion = transaccion;
	}

	public String getZona1() {
		return this.zona1;
	}

	public void setZona1(String zona1) {
		this.zona1 = zona1;
	}

}