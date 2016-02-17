    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
    <%@ taglib uri="/WEB-INF/vista/etiquetas/struts-html.tld" prefix="html" %>


    <br>
    <font size='5'><fmt:message key="formaNuevoLugar.titulo" /></font>

    <form id="forma" action="procesarRegistroLugar.do" method="post">
        <table>
            <tr>
                <td colspan="2">
                   <html:errors />
                </td>
            </tr>
            <tr>
                <td align="right">
                    <fmt:message key="formaNuevoLugar.etiqueta.nombre" />
                </td>
                <td align="left">
                    <input type="text" 
                           name="nombre" 
                           size="50" 
                           maxlength="100" 
                           value="${formaNuevoLugar.nombre}" />
                </td>
            </tr>
            <tr>
                <td align="right">
                    <fmt:message key="formaNuevoLugar.etiqueta.descripcion" />
                </td>
                <td align="left">
                    <input type="text" 
                           name="descripcion" 
                           size="50" 
                           maxlength="100" 
                           value="${formaNuevoLugar.descripcion}" />
                </td>
            </tr>
			<tr>
                <td align="right">
                    <fmt:message key="formaNuevoLugar.etiqueta.poblacion" />
                </td>
                <td align="left">
                    <input type="number" 
                           name="poblacion" 
                           size="50" 
                           maxlength="100" 
                           value="${formaNuevoLugar.poblacion}" />
                </td>
            </tr>
			<tr>
                <td align="right">
                    <fmt:message key="formaNuevoLugar.etiqueta.coordenadas" />
                </td>
                <td align="left">
                    <input type="text" 
                           name="coordenadas" 
                           size="50" 
                           maxlength="100" 
                           value="${formaNuevoLugar.coordenadas}" />
                </td>
            </tr>
			<tr>
                <td align="right">
                    <fmt:message key="formaNuevoLugar.etiqueta.estado" />
                </td>
                <td align="left">
                    <input type="text" 
                           name="estado" 
                           size="50" 
                           maxlength="100" 
                           value="${formaNuevoLugar.estado}" />
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" 
                           name="submit"
                           value="Agregar y terminar"/>
                    <input type="submit" 
                           name="submit"
                           value="Agregar y volver"
                           onclick="forma.action='procesarRegistroLugar.do?volver=si'"/>
                    <input type="button"
                           value="Reset"
                           onclick="location.href='solicitarRegistroLugar.do'" />
                    <input type="submit" 
                           name="org.apache.struts.taglib.html.CANCEL" 
                           value="cancelar" 
                           onclick="bCancel=true;">    
                </td>
            </tr>
        </table>
    </form>