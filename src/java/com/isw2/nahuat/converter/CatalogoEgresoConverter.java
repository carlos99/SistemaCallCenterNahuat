package com.isw2.nahuat.converter;

import com.isw2.nahuat.model.CatalogoEgreso;
import com.isw2.nahuat.bean.CatalogoEgresoFacade;
import com.isw2.nahuat.backing.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "catalogoEgresoConverter")
public class CatalogoEgresoConverter implements Converter {

    @Inject
    private CatalogoEgresoFacade ejbFacade;

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.ejbFacade.find(getKey(value));
    }

    java.lang.String getKey(String value) {
        java.lang.String key;
        key = value;
        return key;
    }

    String getStringKey(java.lang.String value) {
        StringBuffer sb = new StringBuffer();
        sb.append(value);
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null
                || (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof CatalogoEgreso) {
            CatalogoEgreso o = (CatalogoEgreso) object;
            return getStringKey(o.getIdCatalogoEgreso());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), CatalogoEgreso.class.getName()});
            return null;
        }
    }
}
