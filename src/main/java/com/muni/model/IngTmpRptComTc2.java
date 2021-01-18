package com.muni.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the ing_tmp_rpt_com_tc2 database table.
 * 
 */
@Entity
@Table(name="ing_tmp_rpt_com_tc2")

public class IngTmpRptComTc2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="actividad_real")
	private String actividadReal;

	private Integer anio;

	private String apynom;

	@Column(name="cod_electronico")
	private String codElectronico;

	@Column(name="cod_municipio")
	private String codMunicipio;

	@Column(name="cod_postal")
	private String codPostal;

	private String cod35anual;

	private String cod35anual2of5;

	private String cod35anualtol;

	private String cod35anualtol2of5;

	private String cod35cuota;

	private String cod35cuota2of5;

	private String cod35cuotatol;

	private String cod35cuotatol2of5;

	private String cod36cuota;

	private String cod36cuota2of5;

	private String cod40;

	private String cod42barraanual2of5;

	private String cod42barracuota2of5;

	private String cod50anual;

	private String cod50anual2of5;

	private String cod50anualtol;

	private String cod50anualtol2of5;

	private String cod50cuota;

	private String cod50cuota2of5;

	private String cod50cuotatol;

	private String cod50cuotatol2of5;

	@Column(name="cuenta_ban")
	private String cuentaBan;

	private String cuim;

	private Integer cuota;

	private String debaut;

	@Column(name="desc_abrev")
	private String descAbrev;

	@Column(name="desc_tipo_comprob")
	private String descTipoComprob;

	private String desccalenanual;

	private String desccalencuota;

	private String descperiodo;

	private String descripcion;

	private int deudaacumulada;

	@Column(name="digito_ver")
	private Integer digitoVer;

	@Column(name="dom_full")
	private String domFull;

	@Column(name="dom_full_ubicacion")
	private String domFullUbicacion;

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

	@Column(name="emite_compr")
	private String emiteCompr;

	private String estado;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_deuda")
	private Date fechaDeuda;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_prox_vto")
	private Date fechaProxVto;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_tol1")
	private Date fechaTol1;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_tol2")
	private Date fechaTol2;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_tol3")
	private Date fechaTol3;

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

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_vto3")
	private Date fechaVto3;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_vto3_anual")
	private Date fechaVto3Anual;

	private Integer folio;

	@Column(name="ingr_brutos")
	private Integer ingrBrutos;

	private Integer item;

	private String ivadesc;

	private String labeling;

	private String leyenda;

	@Column(name="monto_anual")
	private BigDecimal montoAnual;

	@Column(name="monto_deu")
	private BigDecimal montoDeu;

	@Column(name="monto_dto")
	private BigDecimal montoDto;

	@Column(name="monto_total")
	private BigDecimal montoTotal;

	private BigDecimal monto2;

	@Column(name="monto2_anual")
	private BigDecimal monto2Anual;

	private BigDecimal monto3;

	@Column(name="monto3_anual")
	private BigDecimal monto3Anual;

	@Column(name="mts_espacio_p")
	private Integer mtsEspacioP;

	@Column(name="nom_comercio")
	private String nomComercio;

	@Column(name="nom_fantasia")
	private String nomFantasia;

	@Column(name="nro_comercio")
	private Integer nroComercio;

	@Column(name="nro_comprob")
	private BigInteger nroComprob;

	@Column(name="nro_comprob_anual")
	private BigInteger nroComprobAnual;

	private Integer numerocomercio;

	private String observaciones;

	@Column(name="pago_anual_cuotas")
	private BigDecimal pagoAnualCuotas;

	@Column(name="pago_anual_dto")
	private BigDecimal pagoAnualDto;

	@Column(name="pago_termino_dto")
	private BigDecimal pagoTerminoDto;

	private String recurso;

	private String remesa;

	@Column(name="remesa_desc")
	private String remesaDesc;

	private Integer rubro;

	@Column(name="rubro_desc")
	private String rubroDesc;

	private String rubroprincipal;

	@Column(name="sup_comercial")
	private BigDecimal supComercial;

	@Column(name="tipo_comprob")
	private Integer tipoComprob;

	@Column(name="tipo_comprob_anual")
	private Integer tipoComprobAnual;

	private Integer transaccion;

	private Integer usuario;

	public IngTmpRptComTc2() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getActividadReal() {
		return actividadReal;
	}

	public void setActividadReal(String actividadReal) {
		this.actividadReal = actividadReal;
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

	public String getCod35anual() {
		return cod35anual;
	}

	public void setCod35anual(String cod35anual) {
		this.cod35anual = cod35anual;
	}

	public String getCod35anual2of5() {
		return cod35anual2of5;
	}

	public void setCod35anual2of5(String cod35anual2of5) {
		this.cod35anual2of5 = cod35anual2of5;
	}

	public String getCod35anualtol() {
		return cod35anualtol;
	}

	public void setCod35anualtol(String cod35anualtol) {
		this.cod35anualtol = cod35anualtol;
	}

	public String getCod35anualtol2of5() {
		return cod35anualtol2of5;
	}

	public void setCod35anualtol2of5(String cod35anualtol2of5) {
		this.cod35anualtol2of5 = cod35anualtol2of5;
	}

	public String getCod35cuota() {
		return cod35cuota;
	}

	public void setCod35cuota(String cod35cuota) {
		this.cod35cuota = cod35cuota;
	}

	public String getCod35cuota2of5() {
		return cod35cuota2of5;
	}

	public void setCod35cuota2of5(String cod35cuota2of5) {
		this.cod35cuota2of5 = cod35cuota2of5;
	}

	public String getCod35cuotatol() {
		return cod35cuotatol;
	}

	public void setCod35cuotatol(String cod35cuotatol) {
		this.cod35cuotatol = cod35cuotatol;
	}

	public String getCod35cuotatol2of5() {
		return cod35cuotatol2of5;
	}

	public void setCod35cuotatol2of5(String cod35cuotatol2of5) {
		this.cod35cuotatol2of5 = cod35cuotatol2of5;
	}

	public String getCod36cuota() {
		return cod36cuota;
	}

	public void setCod36cuota(String cod36cuota) {
		this.cod36cuota = cod36cuota;
	}

	public String getCod36cuota2of5() {
		return cod36cuota2of5;
	}

	public void setCod36cuota2of5(String cod36cuota2of5) {
		this.cod36cuota2of5 = cod36cuota2of5;
	}

	public String getCod40() {
		return cod40;
	}

	public void setCod40(String cod40) {
		this.cod40 = cod40;
	}

	public String getCod42barraanual2of5() {
		return cod42barraanual2of5;
	}

	public void setCod42barraanual2of5(String cod42barraanual2of5) {
		this.cod42barraanual2of5 = cod42barraanual2of5;
	}

	public String getCod42barracuota2of5() {
		return cod42barracuota2of5;
	}

	public void setCod42barracuota2of5(String cod42barracuota2of5) {
		this.cod42barracuota2of5 = cod42barracuota2of5;
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

	public String getCuentaBan() {
		return cuentaBan;
	}

	public void setCuentaBan(String cuentaBan) {
		this.cuentaBan = cuentaBan;
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

	public String getDebaut() {
		return debaut;
	}

	public void setDebaut(String debaut) {
		this.debaut = debaut;
	}

	public String getDescAbrev() {
		return descAbrev;
	}

	public void setDescAbrev(String descAbrev) {
		this.descAbrev = descAbrev;
	}

	public String getDescTipoComprob() {
		return descTipoComprob;
	}

	public void setDescTipoComprob(String descTipoComprob) {
		this.descTipoComprob = descTipoComprob;
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

	public String getDescperiodo() {
		return descperiodo;
	}

	public void setDescperiodo(String descperiodo) {
		this.descperiodo = descperiodo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getDeudaacumulada() {
		return deudaacumulada;
	}

	public void setDeudaacumulada(int deudaacumulada) {
		this.deudaacumulada = deudaacumulada;
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

	public String getDomFullUbicacion() {
		return domFullUbicacion;
	}

	public void setDomFullUbicacion(String domFullUbicacion) {
		this.domFullUbicacion = domFullUbicacion;
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

	public String getEmiteCompr() {
		return emiteCompr;
	}

	public void setEmiteCompr(String emiteCompr) {
		this.emiteCompr = emiteCompr;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaDeuda() {
		return fechaDeuda;
	}

	public void setFechaDeuda(Date fechaDeuda) {
		this.fechaDeuda = fechaDeuda;
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

	public Integer getFolio() {
		return folio;
	}

	public void setFolio(Integer folio) {
		this.folio = folio;
	}

	public Integer getIngrBrutos() {
		return ingrBrutos;
	}

	public void setIngrBrutos(Integer ingrBrutos) {
		this.ingrBrutos = ingrBrutos;
	}

	public Integer getItem() {
		return item;
	}

	public void setItem(Integer item) {
		this.item = item;
	}

	public String getIvadesc() {
		return ivadesc;
	}

	public void setIvadesc(String ivadesc) {
		this.ivadesc = ivadesc;
	}

	public String getLabeling() {
		return labeling;
	}

	public void setLabeling(String labeling) {
		this.labeling = labeling;
	}

	public String getLeyenda() {
		return leyenda;
	}

	public void setLeyenda(String leyenda) {
		this.leyenda = leyenda;
	}

	public BigDecimal getMontoAnual() {
		return montoAnual;
	}

	public void setMontoAnual(BigDecimal montoAnual) {
		this.montoAnual = montoAnual;
	}

	public BigDecimal getMontoDeu() {
		return montoDeu;
	}

	public void setMontoDeu(BigDecimal montoDeu) {
		this.montoDeu = montoDeu;
	}

	public BigDecimal getMontoDto() {
		return montoDto;
	}

	public void setMontoDto(BigDecimal montoDto) {
		this.montoDto = montoDto;
	}

	public BigDecimal getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(BigDecimal montoTotal) {
		this.montoTotal = montoTotal;
	}

	public BigDecimal getMonto2() {
		return monto2;
	}

	public void setMonto2(BigDecimal monto2) {
		this.monto2 = monto2;
	}

	public BigDecimal getMonto2Anual() {
		return monto2Anual;
	}

	public void setMonto2Anual(BigDecimal monto2Anual) {
		this.monto2Anual = monto2Anual;
	}

	public BigDecimal getMonto3() {
		return monto3;
	}

	public void setMonto3(BigDecimal monto3) {
		this.monto3 = monto3;
	}

	public BigDecimal getMonto3Anual() {
		return monto3Anual;
	}

	public void setMonto3Anual(BigDecimal monto3Anual) {
		this.monto3Anual = monto3Anual;
	}

	public Integer getMtsEspacioP() {
		return mtsEspacioP;
	}

	public void setMtsEspacioP(Integer mtsEspacioP) {
		this.mtsEspacioP = mtsEspacioP;
	}

	public String getNomComercio() {
		return nomComercio;
	}

	public void setNomComercio(String nomComercio) {
		this.nomComercio = nomComercio;
	}

	public String getNomFantasia() {
		return nomFantasia;
	}

	public void setNomFantasia(String nomFantasia) {
		this.nomFantasia = nomFantasia;
	}

	public Integer getNroComercio() {
		return nroComercio;
	}

	public void setNroComercio(Integer nroComercio) {
		this.nroComercio = nroComercio;
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

	public Integer getNumerocomercio() {
		return numerocomercio;
	}

	public void setNumerocomercio(Integer numerocomercio) {
		this.numerocomercio = numerocomercio;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public BigDecimal getPagoAnualCuotas() {
		return pagoAnualCuotas;
	}

	public void setPagoAnualCuotas(BigDecimal pagoAnualCuotas) {
		this.pagoAnualCuotas = pagoAnualCuotas;
	}

	public BigDecimal getPagoAnualDto() {
		return pagoAnualDto;
	}

	public void setPagoAnualDto(BigDecimal pagoAnualDto) {
		this.pagoAnualDto = pagoAnualDto;
	}

	public BigDecimal getPagoTerminoDto() {
		return pagoTerminoDto;
	}

	public void setPagoTerminoDto(BigDecimal pagoTerminoDto) {
		this.pagoTerminoDto = pagoTerminoDto;
	}

	public String getRecurso() {
		return recurso;
	}

	public void setRecurso(String recurso) {
		this.recurso = recurso;
	}

	public String getRemesa() {
		return remesa;
	}

	public void setRemesa(String remesa) {
		this.remesa = remesa;
	}

	public String getRemesaDesc() {
		return remesaDesc;
	}

	public void setRemesaDesc(String remesaDesc) {
		this.remesaDesc = remesaDesc;
	}

	public Integer getRubro() {
		return rubro;
	}

	public void setRubro(Integer rubro) {
		this.rubro = rubro;
	}

	public String getRubroDesc() {
		return rubroDesc;
	}

	public void setRubroDesc(String rubroDesc) {
		this.rubroDesc = rubroDesc;
	}

	public String getRubroprincipal() {
		return rubroprincipal;
	}

	public void setRubroprincipal(String rubroprincipal) {
		this.rubroprincipal = rubroprincipal;
	}

	public BigDecimal getSupComercial() {
		return supComercial;
	}

	public void setSupComercial(BigDecimal supComercial) {
		this.supComercial = supComercial;
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

	

	
}