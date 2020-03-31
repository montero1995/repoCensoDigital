package com.ve.censodigital.Service;

import com.ve.censodigital.Entity.*;
import com.ve.censodigital.Repository.*;
import javafx.collections.transformation.TransformationList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.rmi.transport.Transport;

import java.util.ArrayList;
import java.util.List;

@Service
public class CensoDigitalService {

    @Autowired
    NacionalidadRepository nacionalidadRepository;
    @Autowired
    SexoRepository sexoRepository;

    @Autowired
    EstadoCivilRepository estadoCivilRepository;

    @Autowired
    NivelInstruccionRepository nivelInstruccionRepository;

    @Autowired
    FrecuenciaIngresoRepository frecuenciaIngresoRepository;

    @Autowired
    CantidadIngresoRepository cantidadIngresoRepository;

    @Autowired
    CondicionTerrenoRepository condicionTerrenoRepository;

    @Autowired
    FormaTenenciaRepository formaTenenciaRepository;
    @Autowired
    TipoTechoRepository tipoTechoRepository;
    @Autowired
    TipoParedesRepository tipoParedesRepository;
    @Autowired
    TipoPadecimientoRepository tipoPadecimientoRepository;

    @Autowired
    TipoInsectoRepository tipoInsectoRepository;
    @Autowired
    AnimalRepository animalRepository;

    @Autowired
    SituacionExclusionRepository situacionExclusionRepository;
    @Autowired
    AguasBlancasRepository aguasBlancasRepository;
    @Autowired
    AguasServidasRepository aguasServidasRepository;
    @Autowired
    TipoGasRepositoy tipoGasRepositoy;
    @Autowired
    TipoSistemaElectricoRepository tipoSistemaElectricoRepository;
    @Autowired
    TipoRecoleccionBasuraRepository tipoRecoleccionBasuraRepository;
    @Autowired
    TelefoniaRepository telefoniaRepository;
    @Autowired
    TipoTransporteRepository tipoTransporteRepository;
    @Autowired
    TipoMecanismoInformacionRepository tipoMecanismoInformacionRepository;
    @Autowired
    ServiciosComunalesRepository serviciosComunalesRepository;

    @Autowired
    CensoDigitalRepository censoDigitalRepository;


    public List<NacionalidadEntity> obtenerTodasNacionalidades() {
        List<NacionalidadEntity> nacionalidadEntityList = new ArrayList<>();
        try {
            nacionalidadEntityList = nacionalidadRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nacionalidadEntityList;
    }

    public List<SexoEntity> obtenerTodosGeneros() {
        List<SexoEntity> sexoEntityList = new ArrayList<>();
        try {
            sexoEntityList = sexoRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sexoEntityList;
    }

    public List<EstadoCivilEntity> obtenerTodosEstadosCiviles() {
        List<EstadoCivilEntity> estadoCivilEntityList = new ArrayList<>();
        try {
            estadoCivilEntityList = estadoCivilRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return estadoCivilEntityList;
    }

    public List<NivelInstruccionEntity> obtenerTodosLosNivelesInstruccion() {
        List<NivelInstruccionEntity> nivelInstruccionEntityList = new ArrayList<>();
        try {
            nivelInstruccionEntityList = nivelInstruccionRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nivelInstruccionEntityList;
    }

    public List<FrecuenciaIngresoEntity> obtenerTodasLasFrecuenciasIngreso() {
        List<FrecuenciaIngresoEntity> frecuenciaIngresoEntityList = new ArrayList<>();
        try {
            frecuenciaIngresoEntityList = frecuenciaIngresoRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return frecuenciaIngresoEntityList;
    }

    public List<CantidadIngresoEntity> obtenerTodasLasCantidadesIngresos() {
        List<CantidadIngresoEntity> cantidadIngresoEntityList = new ArrayList<>();
        try {
            cantidadIngresoEntityList = cantidadIngresoRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cantidadIngresoEntityList;
    }

    public List<CondicionTerrenoEntity> obtenerTodasLasCondicionesTerreno() {
        List<CondicionTerrenoEntity> condicionTerrenoEntityList = new ArrayList<>();
        try {
            condicionTerrenoEntityList = condicionTerrenoRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return condicionTerrenoEntityList;
    }

    public List<FormaTenenciaEntity> obtenerTodasLasFormasTenencia() {
        List<FormaTenenciaEntity> formaTenenciaEntityList = new ArrayList<>();
        try {
            formaTenenciaEntityList = formaTenenciaRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return formaTenenciaEntityList;
    }

    public List<TipoParedesEntity> obtenerTodosTiposParedes() {
        List<TipoParedesEntity> tipoParedesEntityList = new ArrayList<>();
        try {
            tipoParedesEntityList = tipoParedesRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tipoParedesEntityList;
    }

    public List<TipoTechoEntity> obtenerTodosTiposTecho() {
        List<TipoTechoEntity> tipoTechoEntityList = new ArrayList<>();
        try {
            tipoTechoEntityList = tipoTechoRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tipoTechoEntityList;
    }

    public List<TipoPadecimientoEntity> obtenerTodosTipoPadecimientos() {
        List<TipoPadecimientoEntity> tipoPadecimientoEntityList = new ArrayList<>();
        try {
            tipoPadecimientoEntityList = tipoPadecimientoRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tipoPadecimientoEntityList;
    }

    public List<TipoInsectoEntity> obtenerTodosTipoInsectos() {
        List<TipoInsectoEntity> tipoInsectoEntityList = new ArrayList<>();
        try {
            tipoInsectoEntityList = tipoInsectoRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tipoInsectoEntityList;
    }
    public List<AnimalEntity> obtenerTodosTipoAnimales() {
        List<AnimalEntity> animalEntityList = new ArrayList<>();
        try {
            animalEntityList = animalRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return animalEntityList;
    }

    public List<SituacionExclusionEntity> obtenerTodasLasSituacionesExclusion() {
        List<SituacionExclusionEntity> situacionExclusionEntityList = new ArrayList<>();
        try {
            situacionExclusionEntityList = situacionExclusionRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return situacionExclusionEntityList;
    }
      public List<TipoAguasBlancasEntity> obtenerTodasLasAguasBlancas() {
        List<TipoAguasBlancasEntity> tipoAguasBlancasEntityArrayList = new ArrayList<>();
        try {
            tipoAguasBlancasEntityArrayList = aguasBlancasRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tipoAguasBlancasEntityArrayList;
    }

    public List<TipoAguasServidasEntity> obtenerTodasLasAguasServidas() {
        List<TipoAguasServidasEntity> tipoAguasServidasEntityList = new ArrayList<>();
        try {
            tipoAguasServidasEntityList = aguasServidasRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tipoAguasServidasEntityList;
    }
    public List<TipoGasEntity> obtenerTodasLosTipoGas() {
        List<TipoGasEntity> tipoGasEntityList = new ArrayList<>();
        try {
            tipoGasEntityList = tipoGasRepositoy.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tipoGasEntityList;
    }
    public List<TipoSistemaElectricoEntity> obtenerTodasLosTipoSistemaElectrico() {
        List<TipoSistemaElectricoEntity> tipoSistemaElectricoEntityList = new ArrayList<>();
        try {
            tipoSistemaElectricoEntityList = tipoSistemaElectricoRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tipoSistemaElectricoEntityList;
    }
    public List<TipoRecoleccionBasuraEntity> obtenerTodasLosTipoRecoleccionBasura() {
        List<TipoRecoleccionBasuraEntity> tipoRecoleccionBasuraEntityList = new ArrayList<>();
        try {
            tipoRecoleccionBasuraEntityList = tipoRecoleccionBasuraRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tipoRecoleccionBasuraEntityList;
    }

    public List<TelefoniaEntity> obtenerTodasLasTelefonias() {
        List<TelefoniaEntity> telefoniaEntityList = new ArrayList<>();
        try {
            telefoniaEntityList = telefoniaRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return telefoniaEntityList;
    }
    public List<TransporteEntity> obtenerTodasLosTransportes() {
        List<TransporteEntity> transporteEntityList = new ArrayList<>();
        try {
            transporteEntityList = tipoTransporteRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return transporteEntityList;
    }
    public List<TipoMecanismoInformacionEntity> obtenerTodasLosMecanismoInfo() {
        List<TipoMecanismoInformacionEntity> tipoMecanismoInformacionEntityList = new ArrayList<>();
        try {
            tipoMecanismoInformacionEntityList = tipoMecanismoInformacionRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tipoMecanismoInformacionEntityList;
    }

    public List<ServiciosComunalesEntity> obtenerTodasLosServiciosComunales() {
        List<ServiciosComunalesEntity> serviciosComunalesEntityList = new ArrayList<>();
        try {
            serviciosComunalesEntityList = serviciosComunalesRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return serviciosComunalesEntityList;
    }

    public void guardarCenso(CensoDigitalEntity censoDigitalEntity){

        try {
            censoDigitalRepository.save(censoDigitalEntity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
