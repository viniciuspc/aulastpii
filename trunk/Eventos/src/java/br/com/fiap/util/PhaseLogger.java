/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fiap.util;

import java.util.Date;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 *
 * @author rm61828
 */
public class PhaseLogger implements PhaseListener {

    public void afterPhase(PhaseEvent event) {
        System.out.print(new Date());
    }

    public void beforePhase(PhaseEvent event) {
        System.out.print(event.getSource().getClass().getName());
    }

    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }

}
