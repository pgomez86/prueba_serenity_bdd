package gestion.modulos.tasks;

import gestion.modulos.ui.GestionDeInventarioDWDMPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class BuscarCon {
    public static Performable ingresarDatoSistema(String text) {
        return Task.where("{0} ingresa el dato:" + text +" en sistemas",
                Enter.theValue(text).into(GestionDeInventarioDWDMPage.INPUT_SISTEMA)
        );
    }
}
