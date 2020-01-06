package com.ve.censodigital.Entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Gerardo Montero on 08/12/2019.
 */
@Entity
@Table(name = "t_censo_digital")
public class CensoDigitalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,
            generator = "censo_digital_seq")
    @SequenceGenerator(name = "censo_digital_seq",
            sequenceName = "censo_digital_seq", allocationSize = 1)
    @Column(name = "id_censo_digital")
    private Integer idCensoDigital;

    @Column(name = "nombre_consejo_comunal")
    private String nombreConsejoComunal;

    @Column(name = "codigo")
    private String codigo;
    @Column(name = "rif")
    private String rif;
    @Column(name = "numero_cuenta")
    private String numeroCuenta;

    @Column(name = "numero_censo")
    private Integer numeroCenso;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "fecha_censo")
    private Date fechaCenso;

    @Column(name = "estado")
    private String estado;

    @Column(name = "municipio")
    private  String municipio;

    @Column(name = "parroquia")
    private String parroquia;

    @Column(name = "sector")
    private String sector;

    @Column(name = "nombre_comunidad")
    private String nombre_comunidad;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "nombre_persona")
    private String nombre_persona;

    @Column(name = "apellido_persona")
    private String apellido_persona;

    @Column(name = "cedula")
    private String cedula;

    @ManyToOne
    @JoinColumn(name = "id_nacionalidad")
    private NacionalidadEntity nacionalidadEntity;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @Column(name = "edad")
    private String edad;

    @Column(name = "tiempo_comunidad")
    private String tiempoComunidad;

    @Column(name = "cne")
    private String cne;

    @ManyToOne
    @JoinColumn(name = "id_sexo")
    private SexoEntity sexoEntity;

    @Column(name = "incapacidad")
    private String incapacidad;

    @Column(name = "pensionado")
    private String pensionado;

    @ManyToOne
    @JoinColumn(name = "id_estado_civil")
    private EstadoCivilEntity estadoCivilEntity;

    @ManyToOne
    @JoinColumn(name = "id_nivel_instruccion")
    private NivelInstruccionEntity nivelInstruccionEntity;


    @Column(name = "profesion_oficio")
    private String profesion_oficio;


    @Column(name = "trabaja")
    private String trabaja;

    @Column(name = "embarazo_temprano")
    private String embarazo_temprano;

    @ManyToOne
    @JoinColumn(name = "id_frecuencia_ingreso")
    private FrecuenciaIngresoEntity frecuenciaIngresoEntity;

    @Column(name = "email_persona")
    private String email_persona;


    @Column(name = "tlf_habitacion_persona")
    private String tlf_habitacion_persona;

    @Column(name = "tlf_celular_persona")
    private String tlf_celular_persona;

    @Column(name = "tlf_oficina_persona")
    private String tlf_oficina_persona;


    @ManyToOne
    @JoinColumn(name = "id_sector_trabajo")
    private SectorTrabajoEntity sectorTrabajoEntity;

    @ManyToOne
    @JoinColumn(name = "id_tipo_comercio")
    private TipoComercioEntity tipoComercioEntity;

    @Column(name = "realiza_actividad_comercial")
    private String realiza_actividad_comercial;

    @ManyToOne
    @JoinColumn(name = "id_cantidad_ingreso")
    private CantidadIngresoEntity cantidadIngresoEntity;


    @ManyToOne
    @JoinColumn(name = "id_condicion_terreno")
    private CondicionTerrenoEntity condicionTerrenoEntity;

    @ManyToOne
    @JoinColumn(name = "id_forma_tenencia")
    private FormaTenenciaEntity formaTenenciaEntity;

    @ManyToOne
    @JoinColumn(name = "id_tipo_paredes")
    private TipoParedesEntity tipoParedesEntity;

    @ManyToOne
    @JoinColumn(name = "id_tipo_techo")
    private TipoTechoEntity tipoTechoEntity;

    @ManyToOne
    @JoinColumn(name = "id_tipo_insecto")
    private TipoInsectoEntity tipoInsectoEntity;

    @ManyToOne
    @JoinColumn(name = "id_animal")
    private AnimalEntity animalEntity;

    @Column(name = "ayuda_familiar")
    private String ayudaFamiliar;

    @ManyToOne
    @JoinColumn(name = "id_situacion_exclusion")
    private SituacionExclusionEntity situacionExclusionEntity;

    @ManyToOne
    @JoinColumn(name = "id_tipo_aguas_blancas")
    private TipoAguasBlancasEntity aguasBlancasEntity;

    @ManyToOne
    @JoinColumn(name = "id_aguas_servidas")
    private TipoAguasServidasEntity aguasServidasEntity;

    @ManyToOne
    @JoinColumn(name = "id_tipo_gas")
    private TipoGasEntity gasEntity;

    @ManyToOne
    @JoinColumn(name = "id_tipo_sistema_electrico")
    private TipoSistemaElectricoEntity sistemaElectricoEntity;

    @ManyToOne
    @JoinColumn(name = "id_tipo_recoleccion_basura")
    private TipoRecoleccionBasuraEntity recoleccionBasuraEntity;

    @ManyToOne
    @JoinColumn(name = "id_telefonia")
    private TelefoniaEntity telefoniaEntity;

    @ManyToOne
    @JoinColumn(name = "id_transporte")
    private TransporteEntity transporteEntity;

    @ManyToOne
    @JoinColumn(name = "id_tipo_mecanismo_informacion")
    private TipoMecanismoInformacionEntity tipoMecanismoInformacionEntity;

    @ManyToOne
    @JoinColumn(name = "id_servicios_comunales")
    private ServiciosComunalesEntity serviciosComunalesEntity;

    @ManyToOne
    @JoinColumn(name = "id_tipo_padecimiento")
    private TipoPadecimientoEntity tipoPadecimientoEntity;

    public CensoDigitalEntity() {
    }

    public CensoDigitalEntity(String nombreConsejoComunal, String codigo, String rif, String numeroCuenta, Integer numeroCenso, Date fechaCenso, String estado, String municipio, String parroquia, String sector, String nombre_comunidad, String direccion, String nombre_persona, String apellido_persona, String cedula, NacionalidadEntity nacionalidadEntity, Date fechaNacimiento, String edad, String tiempoComunidad, String cne, SexoEntity sexoEntity, String incapacidad, String pensionado, EstadoCivilEntity estadoCivilEntity, NivelInstruccionEntity nivelInstruccionEntity, String profesion_oficio, String trabaja, String embarazo_temprano, FrecuenciaIngresoEntity frecuenciaIngresoEntity, String email_persona, String tlf_habitacion_persona, String tlf_celular_persona, String tlf_oficina_persona, SectorTrabajoEntity sectorTrabajoEntity, TipoComercioEntity tipoComercioEntity, String realiza_actividad_comercial, CantidadIngresoEntity cantidadIngresoEntity, CondicionTerrenoEntity condicionTerrenoEntity, FormaTenenciaEntity formaTenenciaEntity, TipoParedesEntity tipoParedesEntity, TipoTechoEntity tipoTechoEntity, TipoInsectoEntity tipoInsectoEntity, AnimalEntity animalEntity, String ayudaFamiliar, SituacionExclusionEntity situacionExclusionEntity, TipoAguasBlancasEntity aguasBlancasEntity, TipoAguasServidasEntity aguasServidasEntity, TipoGasEntity gasEntity, TipoSistemaElectricoEntity sistemaElectricoEntity, TipoRecoleccionBasuraEntity recoleccionBasuraEntity, TelefoniaEntity telefoniaEntity, TransporteEntity transporteEntity, TipoMecanismoInformacionEntity tipoMecanismoInformacionEntity, ServiciosComunalesEntity serviciosComunalesEntity, TipoPadecimientoEntity tipoPadecimientoEntity) {
        this.nombreConsejoComunal = nombreConsejoComunal;
        this.codigo = codigo;
        this.rif = rif;
        this.numeroCuenta = numeroCuenta;
        this.numeroCenso = numeroCenso;
        this.fechaCenso = fechaCenso;
        this.estado = estado;
        this.municipio = municipio;
        this.parroquia = parroquia;
        this.sector = sector;
        this.nombre_comunidad = nombre_comunidad;
        this.direccion = direccion;
        this.nombre_persona = nombre_persona;
        this.apellido_persona = apellido_persona;
        this.cedula = cedula;
        this.nacionalidadEntity = nacionalidadEntity;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.tiempoComunidad = tiempoComunidad;
        this.cne = cne;
        this.sexoEntity = sexoEntity;
        this.incapacidad = incapacidad;
        this.pensionado = pensionado;
        this.estadoCivilEntity = estadoCivilEntity;
        this.nivelInstruccionEntity = nivelInstruccionEntity;
        this.profesion_oficio = profesion_oficio;
        this.trabaja = trabaja;
        this.embarazo_temprano = embarazo_temprano;
        this.frecuenciaIngresoEntity = frecuenciaIngresoEntity;
        this.email_persona = email_persona;
        this.tlf_habitacion_persona = tlf_habitacion_persona;
        this.tlf_celular_persona = tlf_celular_persona;
        this.tlf_oficina_persona = tlf_oficina_persona;
        this.sectorTrabajoEntity = sectorTrabajoEntity;
        this.tipoComercioEntity = tipoComercioEntity;
        this.realiza_actividad_comercial = realiza_actividad_comercial;
        this.cantidadIngresoEntity = cantidadIngresoEntity;
        this.condicionTerrenoEntity = condicionTerrenoEntity;
        this.formaTenenciaEntity = formaTenenciaEntity;
        this.tipoParedesEntity = tipoParedesEntity;
        this.tipoTechoEntity = tipoTechoEntity;
        this.tipoInsectoEntity = tipoInsectoEntity;
        this.animalEntity = animalEntity;
        this.ayudaFamiliar = ayudaFamiliar;
        this.situacionExclusionEntity = situacionExclusionEntity;
        this.aguasBlancasEntity = aguasBlancasEntity;
        this.aguasServidasEntity = aguasServidasEntity;
        this.gasEntity = gasEntity;
        this.sistemaElectricoEntity = sistemaElectricoEntity;
        this.recoleccionBasuraEntity = recoleccionBasuraEntity;
        this.telefoniaEntity = telefoniaEntity;
        this.transporteEntity = transporteEntity;
        this.tipoMecanismoInformacionEntity = tipoMecanismoInformacionEntity;
        this.serviciosComunalesEntity = serviciosComunalesEntity;
        this.tipoPadecimientoEntity = tipoPadecimientoEntity;
    }

    public Integer getIdCensoDigital() {
        return idCensoDigital;
    }

    public void setIdCensoDigital(Integer idCensoDigital) {
        this.idCensoDigital = idCensoDigital;
    }

    public String getNombreConsejoComunal() {
        return nombreConsejoComunal;
    }

    public void setNombreConsejoComunal(String nombreConsejoComunal) {
        this.nombreConsejoComunal = nombreConsejoComunal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getRif() {
        return rif;
    }

    public void setRif(String rif) {
        this.rif = rif;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Integer getNumeroCenso() {
        return numeroCenso;
    }

    public void setNumeroCenso(Integer numeroCenso) {
        this.numeroCenso = numeroCenso;
    }

    public Date getFechaCenso() {
        return fechaCenso;
    }

    public void setFechaCenso(Date fechaCenso) {
        this.fechaCenso = fechaCenso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getParroquia() {
        return parroquia;
    }

    public void setParroquia(String parroquia) {
        this.parroquia = parroquia;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getNombre_comunidad() {
        return nombre_comunidad;
    }

    public void setNombre_comunidad(String nombre_comunidad) {
        this.nombre_comunidad = nombre_comunidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre_persona() {
        return nombre_persona;
    }

    public void setNombre_persona(String nombre_persona) {
        this.nombre_persona = nombre_persona;
    }

    public String getApellido_persona() {
        return apellido_persona;
    }

    public void setApellido_persona(String apellido_persona) {
        this.apellido_persona = apellido_persona;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public NacionalidadEntity getNacionalidadEntity() {
        return nacionalidadEntity;
    }

    public void setNacionalidadEntity(NacionalidadEntity nacionalidadEntity) {
        this.nacionalidadEntity = nacionalidadEntity;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTiempoComunidad() {
        return tiempoComunidad;
    }

    public void setTiempoComunidad(String tiempoComunidad) {
        this.tiempoComunidad = tiempoComunidad;
    }

    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public SexoEntity getSexoEntity() {
        return sexoEntity;
    }

    public void setSexoEntity(SexoEntity sexoEntity) {
        this.sexoEntity = sexoEntity;
    }

    public String getIncapacidad() {
        return incapacidad;
    }

    public void setIncapacidad(String incapacidad) {
        this.incapacidad = incapacidad;
    }

    public String getPensionado() {
        return pensionado;
    }

    public void setPensionado(String pensionado) {
        this.pensionado = pensionado;
    }

    public EstadoCivilEntity getEstadoCivilEntity() {
        return estadoCivilEntity;
    }

    public void setEstadoCivilEntity(EstadoCivilEntity estadoCivilEntity) {
        this.estadoCivilEntity = estadoCivilEntity;
    }

    public NivelInstruccionEntity getNivelInstruccionEntity() {
        return nivelInstruccionEntity;
    }

    public void setNivelInstruccionEntity(NivelInstruccionEntity nivelInstruccionEntity) {
        this.nivelInstruccionEntity = nivelInstruccionEntity;
    }

    public String getProfesion_oficio() {
        return profesion_oficio;
    }

    public void setProfesion_oficio(String profesion_oficio) {
        this.profesion_oficio = profesion_oficio;
    }

    public String getTrabaja() {
        return trabaja;
    }

    public void setTrabaja(String trabaja) {
        this.trabaja = trabaja;
    }

    public String getEmbarazo_temprano() {
        return embarazo_temprano;
    }

    public void setEmbarazo_temprano(String embarazo_temprano) {
        this.embarazo_temprano = embarazo_temprano;
    }

    public FrecuenciaIngresoEntity getFrecuenciaIngresoEntity() {
        return frecuenciaIngresoEntity;
    }

    public void setFrecuenciaIngresoEntity(FrecuenciaIngresoEntity frecuenciaIngresoEntity) {
        this.frecuenciaIngresoEntity = frecuenciaIngresoEntity;
    }

    public String getEmail_persona() {
        return email_persona;
    }

    public void setEmail_persona(String email_persona) {
        this.email_persona = email_persona;
    }

    public String getTlf_habitacion_persona() {
        return tlf_habitacion_persona;
    }

    public void setTlf_habitacion_persona(String tlf_habitacion_persona) {
        this.tlf_habitacion_persona = tlf_habitacion_persona;
    }

    public String getTlf_celular_persona() {
        return tlf_celular_persona;
    }

    public void setTlf_celular_persona(String tlf_celular_persona) {
        this.tlf_celular_persona = tlf_celular_persona;
    }

    public String getTlf_oficina_persona() {
        return tlf_oficina_persona;
    }

    public void setTlf_oficina_persona(String tlf_oficina_persona) {
        this.tlf_oficina_persona = tlf_oficina_persona;
    }

    public SectorTrabajoEntity getSectorTrabajoEntity() {
        return sectorTrabajoEntity;
    }

    public void setSectorTrabajoEntity(SectorTrabajoEntity sectorTrabajoEntity) {
        this.sectorTrabajoEntity = sectorTrabajoEntity;
    }

    public TipoComercioEntity getTipoComercioEntity() {
        return tipoComercioEntity;
    }

    public void setTipoComercioEntity(TipoComercioEntity tipoComercioEntity) {
        this.tipoComercioEntity = tipoComercioEntity;
    }

    public String getRealiza_actividad_comercial() {
        return realiza_actividad_comercial;
    }

    public void setRealiza_actividad_comercial(String realiza_actividad_comercial) {
        this.realiza_actividad_comercial = realiza_actividad_comercial;
    }

    public CantidadIngresoEntity getCantidadIngresoEntity() {
        return cantidadIngresoEntity;
    }

    public void setCantidadIngresoEntity(CantidadIngresoEntity cantidadIngresoEntity) {
        this.cantidadIngresoEntity = cantidadIngresoEntity;
    }

    public CondicionTerrenoEntity getCondicionTerrenoEntity() {
        return condicionTerrenoEntity;
    }

    public void setCondicionTerrenoEntity(CondicionTerrenoEntity condicionTerrenoEntity) {
        this.condicionTerrenoEntity = condicionTerrenoEntity;
    }

    public FormaTenenciaEntity getFormaTenenciaEntity() {
        return formaTenenciaEntity;
    }

    public void setFormaTenenciaEntity(FormaTenenciaEntity formaTenenciaEntity) {
        this.formaTenenciaEntity = formaTenenciaEntity;
    }

    public TipoParedesEntity getTipoParedesEntity() {
        return tipoParedesEntity;
    }

    public void setTipoParedesEntity(TipoParedesEntity tipoParedesEntity) {
        this.tipoParedesEntity = tipoParedesEntity;
    }

    public TipoTechoEntity getTipoTechoEntity() {
        return tipoTechoEntity;
    }

    public void setTipoTechoEntity(TipoTechoEntity tipoTechoEntity) {
        this.tipoTechoEntity = tipoTechoEntity;
    }

    public TipoInsectoEntity getTipoInsectoEntity() {
        return tipoInsectoEntity;
    }

    public void setTipoInsectoEntity(TipoInsectoEntity tipoInsectoEntity) {
        this.tipoInsectoEntity = tipoInsectoEntity;
    }

    public AnimalEntity getAnimalEntity() {
        return animalEntity;
    }

    public void setAnimalEntity(AnimalEntity animalEntity) {
        this.animalEntity = animalEntity;
    }

    public String getAyudaFamiliar() {
        return ayudaFamiliar;
    }

    public void setAyudaFamiliar(String ayudaFamiliar) {
        this.ayudaFamiliar = ayudaFamiliar;
    }

    public SituacionExclusionEntity getSituacionExclusionEntity() {
        return situacionExclusionEntity;
    }

    public void setSituacionExclusionEntity(SituacionExclusionEntity situacionExclusionEntity) {
        this.situacionExclusionEntity = situacionExclusionEntity;
    }

    public TipoAguasBlancasEntity getAguasBlancasEntity() {
        return aguasBlancasEntity;
    }

    public void setAguasBlancasEntity(TipoAguasBlancasEntity aguasBlancasEntity) {
        this.aguasBlancasEntity = aguasBlancasEntity;
    }

    public TipoAguasServidasEntity getAguasServidasEntity() {
        return aguasServidasEntity;
    }

    public void setAguasServidasEntity(TipoAguasServidasEntity aguasServidasEntity) {
        this.aguasServidasEntity = aguasServidasEntity;
    }

    public TipoGasEntity getGasEntity() {
        return gasEntity;
    }

    public void setGasEntity(TipoGasEntity gasEntity) {
        this.gasEntity = gasEntity;
    }

    public TipoSistemaElectricoEntity getSistemaElectricoEntity() {
        return sistemaElectricoEntity;
    }

    public void setSistemaElectricoEntity(TipoSistemaElectricoEntity sistemaElectricoEntity) {
        this.sistemaElectricoEntity = sistemaElectricoEntity;
    }

    public TipoRecoleccionBasuraEntity getRecoleccionBasuraEntity() {
        return recoleccionBasuraEntity;
    }

    public void setRecoleccionBasuraEntity(TipoRecoleccionBasuraEntity recoleccionBasuraEntity) {
        this.recoleccionBasuraEntity = recoleccionBasuraEntity;
    }

    public TelefoniaEntity getTelefoniaEntity() {
        return telefoniaEntity;
    }

    public void setTelefoniaEntity(TelefoniaEntity telefoniaEntity) {
        this.telefoniaEntity = telefoniaEntity;
    }

    public TransporteEntity getTransporteEntity() {
        return transporteEntity;
    }

    public void setTransporteEntity(TransporteEntity transporteEntity) {
        this.transporteEntity = transporteEntity;
    }

    public TipoMecanismoInformacionEntity getTipoMecanismoInformacionEntity() {
        return tipoMecanismoInformacionEntity;
    }

    public void setTipoMecanismoInformacionEntity(TipoMecanismoInformacionEntity tipoMecanismoInformacionEntity) {
        this.tipoMecanismoInformacionEntity = tipoMecanismoInformacionEntity;
    }

    public ServiciosComunalesEntity getServiciosComunalesEntity() {
        return serviciosComunalesEntity;
    }

    public void setServiciosComunalesEntity(ServiciosComunalesEntity serviciosComunalesEntity) {
        this.serviciosComunalesEntity = serviciosComunalesEntity;
    }

    public TipoPadecimientoEntity getTipoPadecimientoEntity() {
        return tipoPadecimientoEntity;
    }

    public void setTipoPadecimientoEntity(TipoPadecimientoEntity tipoPadecimientoEntity) {
        this.tipoPadecimientoEntity = tipoPadecimientoEntity;
    }
}
