package com.ve.censodigital.Service;


import com.ve.censodigital.Entity.CensoDigitalEntity;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.apache.poi.ss.usermodel.Cell;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@Service
public class ExportarExcelService {
    @Transactional
    public void exportarBienesAExcel(List<CensoDigitalEntity> censoDigitalEntityList, HttpServletResponse response) {

        try {

            XSSFWorkbook workbook = new XSSFWorkbook();

            XSSFSheet hojaExcel = workbook.createSheet("Censos");// crea una hoja vacia
            hojaExcel.setColumnWidth(0, 5000);
            hojaExcel.setColumnWidth(1, 5000);
            hojaExcel.setColumnWidth(2, 5000);
            hojaExcel.setColumnWidth(3, 5000);
            hojaExcel.setColumnWidth(4, 5000);
            hojaExcel.setColumnWidth(5, 5000);
            hojaExcel.setColumnWidth(6, 5000);
            hojaExcel.setColumnWidth(7, 5000);
            hojaExcel.setColumnWidth(8, 5000);
            hojaExcel.setColumnWidth(9, 5000);
            hojaExcel.setColumnWidth(10, 5000);
            hojaExcel.setColumnWidth(11, 5000);
            hojaExcel.setColumnWidth(12, 5000);
            hojaExcel.setColumnWidth(13, 5000);
            hojaExcel.setColumnWidth(14, 5000);
            hojaExcel.setColumnWidth(15, 5000);
            hojaExcel.setColumnWidth(16, 5000);
            hojaExcel.setColumnWidth(17, 5000);
            hojaExcel.setColumnWidth(18, 5000);
            hojaExcel.setColumnWidth(19, 5000);
            hojaExcel.setColumnWidth(20, 5000);
            hojaExcel.setColumnWidth(21, 5000);
            hojaExcel.setColumnWidth(22, 5000);
            hojaExcel.setColumnWidth(23, 5000);
            hojaExcel.setColumnWidth(24, 5000);
            hojaExcel.setColumnWidth(25, 5000);
            hojaExcel.setColumnWidth(26, 5000);
            hojaExcel.setColumnWidth(27, 5000);
            hojaExcel.setColumnWidth(28, 5000);
            hojaExcel.setColumnWidth(29, 5000);
            hojaExcel.setColumnWidth(30, 5000);
            hojaExcel.setColumnWidth(31, 5000);
            hojaExcel.setColumnWidth(32, 5000);
            hojaExcel.setColumnWidth(33, 5000);
            hojaExcel.setColumnWidth(34, 5000);
            hojaExcel.setColumnWidth(35, 5000);
            hojaExcel.setColumnWidth(36, 5000);
            hojaExcel.setColumnWidth(37, 5000);
            hojaExcel.setColumnWidth(38, 5000);
            hojaExcel.setColumnWidth(39, 5000);
            hojaExcel.setColumnWidth(40, 5000);
            hojaExcel.setColumnWidth(41, 5000);
            hojaExcel.setColumnWidth(42, 5000);
            hojaExcel.setColumnWidth(43, 5000);
            hojaExcel.setColumnWidth(44, 5000);
            hojaExcel.setColumnWidth(45, 5000);
            hojaExcel.setColumnWidth(46, 5000);
            hojaExcel.setColumnWidth(47, 5000);
            hojaExcel.setColumnWidth(48, 5000);
            hojaExcel.setColumnWidth(49, 5000);
            hojaExcel.setColumnWidth(50, 5000);

            hojaExcel.setColumnWidth(51, 5000);

            hojaExcel.setColumnWidth(52, 5000);

            hojaExcel.setColumnWidth(53, 5000);




            int rownum = 1;

            Row row = hojaExcel.createRow(0);
            CellStyle cellStyle = hojaExcel.getColumnStyle(0);

            Cell cell = row.createCell(0);

            cell.setCellStyle(cellStyle);
            cell.setCellValue("Id Censo");

            cell = row.createCell(1);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Nombre Consejo Comunal");

            cell = row.createCell(2);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Codigo");

            cell = row.createCell(3);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Rif");

            cell = row.createCell(4);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Numero Cuenta");

            cell = row.createCell(5);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Numero Censo");

            cell = row.createCell(6);
            cell.setCellStyle(cellStyle);
                cell.setCellValue("Fecha Censo");

            cell = row.createCell(7);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Estado");

            cell = row.createCell(8);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Municipio");

            cell = row.createCell(9);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Parroquia");

            cell = row.createCell(10);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Sector");

            cell = row.createCell(11);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Nombre Comunidad");

            cell = row.createCell(12);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Dirección");

            cell = row.createCell(13);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Nombre Persona");

            cell = row.createCell(14);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Apellido Persona");

            cell = row.createCell(15);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Cedula");

            cell = row.createCell(16);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Nacionalidad");

            cell = row.createCell(17);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Fecha Nacimiento");

            cell = row.createCell(18);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Edad");

            cell = row.createCell(19);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Tiempo Comunidad");

            cell = row.createCell(20);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Cne");

            cell = row.createCell(21);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Sexo");

            cell = row.createCell(22);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Incapacidad");

            cell = row.createCell(23);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Pensionado");

            cell = row.createCell(24);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Estado Civil");

            cell = row.createCell(25);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Nivel Instrucción");

            cell = row.createCell(26);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Profesión/Ocio");

            cell = row.createCell(27);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Trabaja");

            cell = row.createCell(28);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Embarazo Temprano");

            cell = row.createCell(29);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Frecuencia de Ingresos");

            cell = row.createCell(30);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Email Personal");

            cell = row.createCell(31);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Telefono Habitación");



            cell = row.createCell(32);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Telefono Celular");

            cell = row.createCell(33);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Telefono Oficina");

//            cell = row.createCell(34);
//            cell.setCellStyle(cellStyle);
//            cell.setCellValue("Sector Trabajo");

//            cell = row.createCell(34);
//            cell.setCellStyle(cellStyle);
//            cell.setCellValue("Tipo Comercio");

            cell = row.createCell(34);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Actividad Comercial");

            cell = row.createCell(35);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Cantidad de Ingresos");

            cell = row.createCell(36);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Condicion del Terreno");

            cell = row.createCell(37);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Forma Tenencia");

            cell = row.createCell(38);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Tipo Paredes");

            cell = row.createCell(39);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Tipo Techo");

            cell = row.createCell(40);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Tipo Insecto");

            cell = row.createCell(41);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Posee Animal");

            cell = row.createCell(42);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Ayuda Familiar");

            cell = row.createCell(43);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Situación Exclusión");

            cell = row.createCell(44);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Aguas Blancas");

            cell = row.createCell(45);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Aguas Servidas");


            cell = row.createCell(46);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Tipo Gas");

            cell = row.createCell(47);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Sistema Electrico");

            cell = row.createCell(48);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Recolección Basura");

            cell = row.createCell(49);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Telefonía");

            cell = row.createCell(50);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Transporte");

            cell = row.createCell(51);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Mecanismo Información");

            cell = row.createCell(52);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Servicios Comunales");

            cell = row.createCell(53);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Padecimiento");

//            cell = row.createCell(56);
//            cell.setCellStyle(cellStyle);
//            cell.setCellValue("Presencia Insectos");
//
//            cell = row.createCell(57);
//            cell.setCellStyle(cellStyle);
//            cell.setCellValue("Presencia Animal");




            for (CensoDigitalEntity censo : censoDigitalEntityList)
            {
               row = hojaExcel.createRow(rownum++);
               crearLista(censo, row);

            }
            String url = new File(".").getCanonicalPath() + "\\FileCM\\" +"Censo.xls";

            File file = new File(url);

            FileOutputStream out = new FileOutputStream(file);
            workbook.write(out);
            out.close();

            FileInputStream fis = null;
            byte[] bArray = new byte[(int) file.length()];
            try{
                fis = new FileInputStream(file);
                fis.read(bArray);
                fis.close();

            }catch(IOException ioExp){
                ioExp.printStackTrace();
            }

            String contentType = "application/octet-stream";

            response.setHeader("Content-disposition", "attachment;filename=censos.xls");
            response.setHeader("charset", "iso-8859-1");
            response.setContentType(contentType);
            response.setContentLength(bArray.length);
            response.setStatus(HttpServletResponse.SC_OK);

            ServletOutputStream outputStream = null;
            try {
                outputStream = response.getOutputStream();
                outputStream.write(bArray, 0, bArray.length);
                outputStream.flush();
                outputStream.close();
            } catch (IOException e) {

            }

        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    private void crearLista(CensoDigitalEntity censoDigitalEntity, Row row){

        Cell cell = row.createCell(0);{
            cell.setCellValue(censoDigitalEntity.getIdCensoDigital());
        cell = row.createCell(1);
            cell.setCellValue(censoDigitalEntity.getNombreConsejoComunal());



        cell = row.createCell(2);
            cell.setCellValue(censoDigitalEntity.getCodigo());

        cell = row.createCell(3);
            cell.setCellValue(censoDigitalEntity.getRif());

            cell = row.createCell(4);
            cell.setCellValue(censoDigitalEntity.getNumeroCuenta());
            cell = row.createCell(5);
            if(censoDigitalEntity.getNumeroCenso()==null){
                censoDigitalEntity.setNumeroCenso(0);
                cell.setCellValue(censoDigitalEntity.getNumeroCenso());
            }
            cell.setCellValue(censoDigitalEntity.getNumeroCenso());
            cell = row.createCell(6);
            cell.setCellValue(censoDigitalEntity.getFechaCenso());
            cell = row.createCell(7);
            cell.setCellValue(censoDigitalEntity.getEstado());
            cell = row.createCell(8);
            cell.setCellValue(censoDigitalEntity.getMunicipio());
            cell = row.createCell(9);
            cell.setCellValue(censoDigitalEntity.getParroquia());
            cell = row.createCell(10);
            cell.setCellValue(censoDigitalEntity.getSector());
            cell = row.createCell(11);
            cell.setCellValue(censoDigitalEntity.getNombreComunidad());
            cell = row.createCell(12);
            cell.setCellValue(censoDigitalEntity.getDireccion());
            cell = row.createCell(13);
            cell.setCellValue(censoDigitalEntity.getNombrePersona());
            cell = row.createCell(14);
            cell.setCellValue(censoDigitalEntity.getApellidoPersona());
            cell = row.createCell(15);
            cell.setCellValue(censoDigitalEntity.getCedula());
            cell = row.createCell(16);
            cell.setCellValue(censoDigitalEntity.getNacionalidadEntity().getNacionalidad());
            cell = row.createCell(17);
            cell.setCellValue(censoDigitalEntity.getFechaNacimiento());
            cell = row.createCell(18);
            cell.setCellValue(censoDigitalEntity.getEdad());
            cell = row.createCell(19);
            cell.setCellValue(censoDigitalEntity.getTiempoComunidad());
            cell = row.createCell(20);
            cell.setCellValue(censoDigitalEntity.getCne());
            cell = row.createCell(21);
            cell.setCellValue(censoDigitalEntity.getSexoEntity().getSexo());
            cell = row.createCell(22);
            cell.setCellValue(censoDigitalEntity.getIncapacidad());
            cell = row.createCell(23);
            cell.setCellValue(censoDigitalEntity.getPensionado());
            cell = row.createCell(24);
            cell.setCellValue(censoDigitalEntity.getEstadoCivilEntity().getDescripcion());
            cell = row.createCell(25);
            cell.setCellValue(censoDigitalEntity.getNivelInstruccionEntity().getNivelInstruccion());
            cell = row.createCell(26);
            cell.setCellValue(censoDigitalEntity.getProfesionOficio());
            cell = row.createCell(27);
            cell.setCellValue(censoDigitalEntity.getTrabaja());
            cell = row.createCell(28);
            cell.setCellValue(censoDigitalEntity.getEmbarazoTemprano());
            cell = row.createCell(29);
            cell.setCellValue(censoDigitalEntity.getFrecuenciaIngresoEntity().getFrecuencia());
            cell = row.createCell(30);
            cell.setCellValue(censoDigitalEntity.getEmailPersona());
            cell = row.createCell(31);
            cell.setCellValue(censoDigitalEntity.getTlfHabitacionPersona());
            cell = row.createCell(32);
            cell.setCellValue(censoDigitalEntity.getTlfCelularPersona());
            cell = row.createCell(33);
            cell.setCellValue(censoDigitalEntity.getTlfOficinaPersona());
//            cell = row.createCell(34);
//            cell.setCellValue(censoDigitalEntity.getSectorTrabajoEntity().getDescripcion());
//            cell = row.createCell(34);
//            cell.setCellValue(censoDigitalEntity.getTipoComercioEntity().getDescripcion());
            cell = row.createCell(34);
            cell.setCellValue(censoDigitalEntity.getRealizaActividadComercial());
            cell = row.createCell(35);
            cell.setCellValue(censoDigitalEntity.getCantidadIngresoEntity().getCantidad());
            cell = row.createCell(36);
            cell.setCellValue(censoDigitalEntity.getCondicionTerrenoEntity().getDescripcion());
            cell = row.createCell(37);
            cell.setCellValue(censoDigitalEntity.getFormaTenenciaEntity().getDescripcion());
            cell = row.createCell(38);
            cell.setCellValue(censoDigitalEntity.getTipoParedesEntity().getDescripcion());
            cell = row.createCell(39);
            cell.setCellValue(censoDigitalEntity.getTipoTechoEntity().getDescripcion());
            cell = row.createCell(40);
            cell.setCellValue(censoDigitalEntity.getTipoInsectoEntity().getDescripcion());
            cell = row.createCell(41);
            cell.setCellValue(censoDigitalEntity.getAnimalEntity().getDescripcion());
            cell = row.createCell(42);
            cell.setCellValue(censoDigitalEntity.getAyudaFamiliar());
            cell = row.createCell(43);
            cell.setCellValue(censoDigitalEntity.getSituacionExclusionEntity().getDescripcion());
            cell = row.createCell(44);
            cell.setCellValue(censoDigitalEntity.getAguasBlancasEntity().getDescripcion());
            cell = row.createCell(45);
            cell.setCellValue(censoDigitalEntity.getAguasServidasEntity().getDescripcion());
            cell = row.createCell(46);
            cell.setCellValue(censoDigitalEntity.getGasEntity().getDescripcion());
            cell = row.createCell(47);
            cell.setCellValue(censoDigitalEntity.getSistemaElectricoEntity().getDescripcion());
            cell = row.createCell(48);
            cell.setCellValue(censoDigitalEntity.getRecoleccionBasuraEntity().getDescripcion());
            cell = row.createCell(49);
            cell.setCellValue(censoDigitalEntity.getTelefoniaEntity().getDescripcion());
            cell = row.createCell(50);
            cell.setCellValue(censoDigitalEntity.getTransporteEntity().getDescripcion());
            cell = row.createCell(51);
            cell.setCellValue(censoDigitalEntity.getTipoMecanismoInformacionEntity().getDescripcion());
            cell = row.createCell(52);
            cell.setCellValue(censoDigitalEntity.getServiciosComunalesEntity().getDescripcion());
            cell = row.createCell(53);
            cell.setCellValue(censoDigitalEntity.getTipoPadecimientoEntity().getDescripcion());
           // cell = row.createCell(54);
//            cell.setCellValue(censoDigitalEntity.getPresenciaInsectos());
//            cell = row.createCell(57);
//            cell.setCellValue(censoDigitalEntity.getPresenciaAnimal());

    }
}}
