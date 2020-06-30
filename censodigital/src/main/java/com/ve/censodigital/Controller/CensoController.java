package com.ve.censodigital.Controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.ve.censodigital.Entity.*;
import com.ve.censodigital.Repository.AnimalRepository;
import com.ve.censodigital.Service.CensoDigitalService;
import com.ve.censodigital.Service.ExportarExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CensoController {
    @Autowired
    CensoDigitalService censoDigitalService;

    @Autowired
    ExportarExcelService exportarExcelService;

    @PostMapping("/datosPersonales_I")
    public ModelAndView datosPersonales_I(@ModelAttribute("censoDigitalEntity") CensoDigitalEntity censoDigitalEntity, HttpServletRequest httpServletRequest) {
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        List<NacionalidadEntity> nacionalidadEntityList = new ArrayList<>();
        List<SexoEntity> sexoEntityList = new ArrayList<>();
        List<EstadoCivilEntity> estadoCivilEntityList = new ArrayList<>();
        List<NivelInstruccionEntity> nivelInstruccionEntityList = new ArrayList<>();
        List<FrecuenciaIngresoEntity> frecuenciaIngresoEntityList = new ArrayList<>();
        List<CantidadIngresoEntity> cantidadIngresoEntityList = new ArrayList<>();

        try {
            nacionalidadEntityList = censoDigitalService.obtenerTodasNacionalidades();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            sexoEntityList = censoDigitalService.obtenerTodosGeneros();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            estadoCivilEntityList = censoDigitalService.obtenerTodosEstadosCiviles();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            nivelInstruccionEntityList = censoDigitalService.obtenerTodosLosNivelesInstruccion();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            frecuenciaIngresoEntityList = censoDigitalService.obtenerTodasLasFrecuenciasIngreso();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            cantidadIngresoEntityList = censoDigitalService.obtenerTodasLasCantidadesIngresos();
        } catch (Exception e) {
            e.printStackTrace();
        }
        modelAndView.addObject("cantidadIngresoEntityList", cantidadIngresoEntityList);
        modelAndView.addObject("frecuenciaIngresoEntityList", frecuenciaIngresoEntityList);
        modelAndView.addObject("nivelInstruccionEntityList", nivelInstruccionEntityList);
        modelAndView.addObject("estadoCivilEntityList", estadoCivilEntityList);
        modelAndView.addObject("sexoEntityList", sexoEntityList);
        modelAndView.addObject("nacionalidadEntityList", nacionalidadEntityList);
        httpServletRequest.getSession().setAttribute("censoDigitalEntitySession", censoDigitalEntity);
        modelAndView.setViewName("datosPersonales_I");
        return modelAndView;
    }

    @PostMapping("/situacionVivienda")
    public ModelAndView situacionVivienda(@ModelAttribute("censoDigitalEntity") CensoDigitalEntity censoDigitalEntity, HttpServletRequest httpServletRequest) {
        CensoDigitalEntity censoDigitalEntitySession = new CensoDigitalEntity();
        ModelAndView modelAndView = new ModelAndView();
        List<TipoParedesEntity> tipoParedesEntityList = new ArrayList<>();
        List<TipoTechoEntity> tipoTechoEntityList = new ArrayList<>();
        List<FormaTenenciaEntity> formaTenenciaEntityList = new ArrayList<>();
        List<CondicionTerrenoEntity> condicionTerrenoEntityList = new ArrayList<>();
        List<TipoInsectoEntity> tipoInsectoEntityList = new ArrayList<>();
        List<AnimalEntity> animalEntityList = new ArrayList<>();


        //Sets objeto de la vista datos personales a session
        censoDigitalEntitySession = (CensoDigitalEntity) httpServletRequest.getSession().getAttribute("censoDigitalEntitySession");
        censoDigitalEntitySession.setNombrePersona(censoDigitalEntity.getNombrePersona());
        censoDigitalEntitySession.setApellidoPersona(censoDigitalEntity.getApellidoPersona());
        censoDigitalEntitySession.setCedula(censoDigitalEntity.getCedula());
        censoDigitalEntitySession.setFechaNacimiento(censoDigitalEntity.getFechaNacimiento());
        censoDigitalEntitySession.setCne(censoDigitalEntity.getCne());
        censoDigitalEntitySession.setEdad(censoDigitalEntity.getEdad());
        censoDigitalEntitySession.setEmailPersona(censoDigitalEntity.getEmailPersona());
        censoDigitalEntitySession.setNivelInstruccionEntity(censoDigitalEntity.getNivelInstruccionEntity());
        censoDigitalEntitySession.setTiempoComunidad(censoDigitalEntity.getTiempoComunidad());
        censoDigitalEntitySession.setEstadoCivilEntity(censoDigitalEntity.getEstadoCivilEntity());
        censoDigitalEntitySession.setProfesionOficio(censoDigitalEntity.getProfesionOficio());
        censoDigitalEntitySession.setTrabaja(censoDigitalEntity.getTrabaja());
        censoDigitalEntitySession.setSexoEntity(censoDigitalEntity.getSexoEntity());
        censoDigitalEntitySession.setFrecuenciaIngresoEntity(censoDigitalEntity.getFrecuenciaIngresoEntity());
        censoDigitalEntitySession.setCantidadIngresoEntity(censoDigitalEntity.getCantidadIngresoEntity());
        censoDigitalEntitySession.setNacionalidadEntity(censoDigitalEntity.getNacionalidadEntity());
        censoDigitalEntitySession.setPensionado(censoDigitalEntity.getPensionado());
        censoDigitalEntitySession.setIncapacidad(censoDigitalEntity.getIncapacidad());
        censoDigitalEntitySession.setTlfCelularPersona(censoDigitalEntity.getTlfCelularPersona());
        if (censoDigitalEntity.getTlfHabitacionPersona() != null) {
            censoDigitalEntitySession.setTlfHabitacionPersona(censoDigitalEntity.getTlfHabitacionPersona());

        }
        if (censoDigitalEntity.getTlfOficinaPersona() != null) {
            censoDigitalEntitySession.setTlfOficinaPersona(censoDigitalEntity.getTlfOficinaPersona());
        }
        if (censoDigitalEntity.getEmbarazoTemprano() != null) {
            censoDigitalEntitySession.setEmbarazoTemprano(censoDigitalEntity.getEmbarazoTemprano());
        }


        try {
            tipoParedesEntityList = censoDigitalService.obtenerTodosTiposParedes();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            tipoTechoEntityList = censoDigitalService.obtenerTodosTiposTecho();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            formaTenenciaEntityList = censoDigitalService.obtenerTodasLasFormasTenencia();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            condicionTerrenoEntityList = censoDigitalService.obtenerTodasLasCondicionesTerreno();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            tipoInsectoEntityList = censoDigitalService.obtenerTodosTipoInsectos();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            animalEntityList = censoDigitalService.obtenerTodosTipoAnimales();
        } catch (Exception e) {
            e.printStackTrace();
        }
        modelAndView.addObject("animalEntityList", animalEntityList);
        modelAndView.addObject("tipoInsectoEntityList", tipoInsectoEntityList);
        modelAndView.addObject("tipoParedesEntityList", tipoParedesEntityList);
        modelAndView.addObject("tipoTechoEntityList", tipoTechoEntityList);
        modelAndView.addObject("formaTenenciaEntityList", formaTenenciaEntityList);
        modelAndView.addObject("condicionTerrenoEntityList", condicionTerrenoEntityList);
        httpServletRequest.getSession().setAttribute("censoDigitalEntitySession", censoDigitalEntitySession);
        modelAndView.setViewName("situacionVivienda_I");
        return modelAndView;
    }


    @PostMapping("/situacionSalud")
    public ModelAndView situacionSalud(@ModelAttribute("censoDigitalEntity") CensoDigitalEntity censoDigitalEntity, HttpServletRequest httpServletRequest) {
        ModelAndView modelAndView = new ModelAndView();
        CensoDigitalEntity censoDigitalEntitySession = new CensoDigitalEntity();
        List<TipoPadecimientoEntity> tipoPadecimientoEntityList = new ArrayList<>();
        List<SituacionExclusionEntity> situacionExclusionEntityList = new ArrayList<>();

        censoDigitalEntitySession = (CensoDigitalEntity) httpServletRequest.getSession().getAttribute("censoDigitalEntitySession");
        censoDigitalEntitySession.setTipoParedesEntity(censoDigitalEntity.getTipoParedesEntity());
        censoDigitalEntitySession.setTipoTechoEntity(censoDigitalEntity.getTipoTechoEntity());
        censoDigitalEntitySession.setCondicionTerrenoEntity(censoDigitalEntity.getCondicionTerrenoEntity());
        censoDigitalEntitySession.setFormaTenenciaEntity(censoDigitalEntity.getFormaTenenciaEntity());
        censoDigitalEntitySession.setRealizaActividadComercial(censoDigitalEntity.getRealizaActividadComercial());
        censoDigitalEntitySession.setAnimalEntity(censoDigitalEntity.getAnimalEntity());
        censoDigitalEntitySession.setTipoInsectoEntity(censoDigitalEntity.getTipoInsectoEntity());

        try {
            tipoPadecimientoEntityList = censoDigitalService.obtenerTodosTipoPadecimientos();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            situacionExclusionEntityList = censoDigitalService.obtenerTodasLasSituacionesExclusion();
        } catch (Exception e) {
            e.printStackTrace();
        }

        modelAndView.addObject("situacionExclusionEntityList", situacionExclusionEntityList);
        modelAndView.addObject("tipoPadecimientoEntityList", tipoPadecimientoEntityList);
        httpServletRequest.getSession().setAttribute("censoDigitalEntitySession", censoDigitalEntitySession);
        modelAndView.setViewName("situacionSalud");
        return modelAndView;
    }

    @PostMapping("/situacionServicios")
    public ModelAndView situacionServicios(@ModelAttribute("censoDigitalEntity") CensoDigitalEntity censoDigitalEntity, HttpServletRequest httpServletRequest) {
        ModelAndView modelAndView = new ModelAndView();
        CensoDigitalEntity censoDigitalEntitySession = new CensoDigitalEntity();
        List<TipoAguasBlancasEntity> tipoAguasBlancasEntityList = new ArrayList<>();
        List<TipoAguasServidasEntity> tipoAguasServidasEntityList = new ArrayList<>();
        List<TipoGasEntity> tipoGasEntityList = new ArrayList<>();
        List<TipoSistemaElectricoEntity> tipoSistemaElectricoEntityList = new ArrayList<>();

        List<TipoRecoleccionBasuraEntity> tipoRecoleccionBasuraEntityList = new ArrayList<>();

        List<TelefoniaEntity> telefoniaEntityList = new ArrayList<>();

        List<TransporteEntity> transporteEntityList = new ArrayList<>();

        List<TipoMecanismoInformacionEntity> tipoMecanismoInformacionEntityList = new ArrayList<>();

        List<ServiciosComunalesEntity> serviciosComunalesEntityList = new ArrayList<>();


        censoDigitalEntitySession = (CensoDigitalEntity) httpServletRequest.getSession().getAttribute("censoDigitalEntitySession");
        censoDigitalEntitySession.setSituacionExclusionEntity(censoDigitalEntity.getSituacionExclusionEntity());
        censoDigitalEntitySession.setTipoPadecimientoEntity(censoDigitalEntity.getTipoPadecimientoEntity());
        censoDigitalEntitySession.setAyudaFamiliar(censoDigitalEntity.getAyudaFamiliar());

        try {
            tipoAguasBlancasEntityList = censoDigitalService.obtenerTodasLasAguasBlancas();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            tipoAguasServidasEntityList = censoDigitalService.obtenerTodasLasAguasServidas();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            tipoGasEntityList = censoDigitalService.obtenerTodasLosTipoGas();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            tipoSistemaElectricoEntityList = censoDigitalService.obtenerTodasLosTipoSistemaElectrico();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            tipoRecoleccionBasuraEntityList = censoDigitalService.obtenerTodasLosTipoRecoleccionBasura();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            telefoniaEntityList = censoDigitalService.obtenerTodasLasTelefonias();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            transporteEntityList = censoDigitalService.obtenerTodasLosTransportes();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            tipoMecanismoInformacionEntityList = censoDigitalService.obtenerTodasLosMecanismoInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            serviciosComunalesEntityList = censoDigitalService.obtenerTodasLosServiciosComunales();
        } catch (Exception e) {
            e.printStackTrace();
        }
        modelAndView.addObject("tipoAguasBlancasEntityList", tipoAguasBlancasEntityList);
        modelAndView.addObject("tipoAguasServidasEntityList", tipoAguasServidasEntityList);

        modelAndView.addObject("tipoGasEntityList", tipoGasEntityList);

        modelAndView.addObject("tipoSistemaElectricoEntityList", tipoSistemaElectricoEntityList);

        modelAndView.addObject("tipoRecoleccionBasuraEntityList", tipoRecoleccionBasuraEntityList);
        modelAndView.addObject("telefoniaEntityList", telefoniaEntityList);
        modelAndView.addObject("transporteEntityList", transporteEntityList);
        modelAndView.addObject("tipoMecanismoInformacionEntityList", tipoMecanismoInformacionEntityList);
        modelAndView.addObject("serviciosComunalesEntityList", serviciosComunalesEntityList);

        httpServletRequest.getSession().setAttribute("censoDigitalEntitySession", censoDigitalEntitySession);
        modelAndView.setViewName("situacionServicios");
        return modelAndView;
    }

    @PostMapping("/guardarCenso")
    public ModelAndView guardarCenso(@ModelAttribute("censoDigitalEntity") CensoDigitalEntity censoDigitalEntity, HttpServletRequest httpServletRequest){
        ModelAndView modelAndView = new ModelAndView();
        CensoDigitalEntity censoDigitalEntitySession = new CensoDigitalEntity();
        censoDigitalEntitySession= (CensoDigitalEntity) httpServletRequest.getSession().getAttribute("censoDigitalEntitySession");
        censoDigitalEntitySession.setAguasBlancasEntity(censoDigitalEntity.getAguasBlancasEntity());
        censoDigitalEntitySession.setAguasServidasEntity(censoDigitalEntity.getAguasServidasEntity());
        censoDigitalEntitySession.setGasEntity(censoDigitalEntity.getGasEntity());
        censoDigitalEntitySession.setSistemaElectricoEntity(censoDigitalEntity.getSistemaElectricoEntity());
        censoDigitalEntitySession.setRecoleccionBasuraEntity(censoDigitalEntity.getRecoleccionBasuraEntity());
        censoDigitalEntitySession.setTelefoniaEntity(censoDigitalEntity.getTelefoniaEntity());
        censoDigitalEntitySession.setTransporteEntity(censoDigitalEntity.getTransporteEntity());
        censoDigitalEntitySession.setTipoMecanismoInformacionEntity(censoDigitalEntity.getTipoMecanismoInformacionEntity());
        censoDigitalEntitySession.setServiciosComunalesEntity(censoDigitalEntity.getServiciosComunalesEntity());
        try {
            censoDigitalService.guardarCenso(censoDigitalEntitySession);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<CensoDigitalEntity> censoDigitalEntityList= new ArrayList<>();
        try {
            censoDigitalEntityList=  censoDigitalService.obtenerTodosLosCensos();
        } catch (Exception e) {
            e.printStackTrace();
        }
       httpServletRequest.getSession().removeAttribute("censoDigitalEntitySession");
        modelAndView.addObject("censoDigitalEntityList",censoDigitalEntityList);
        modelAndView.addObject("modalRegistroExitoso",true);
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @GetMapping("/ubicacionGeograficaComunidad_I")
    public ModelAndView ubicacionGeograficaComunidad_I(HttpServletRequest httpServletRequest) {
        ModelAndView modelAndView = new ModelAndView();
        httpServletRequest.removeAttribute("censoDigitalEntitySession");
        modelAndView.setViewName("ubicacionGeograficaComunidad_I");
        return modelAndView;
    }

    @PostMapping("/exportarCensosAExcel")
    public void exportarCensoAExcel(HttpServletResponse response){
        List<CensoDigitalEntity> censoDigitalEntityList= new ArrayList<>();
        try {
            censoDigitalEntityList=  censoDigitalService.obtenerTodosLosCensos();
        } catch (Exception e) {
            e.printStackTrace();
    }
        exportarExcelService.exportarBienesAExcel(censoDigitalEntityList, response);
}}
