/**
 * @file AddBDLInputPort
 * @version 1.0.0
 * @type java
 * @data 2020-04-25
 * @author Matteo Brosolo
 * @email hexatech016@gmail.com
 * @license MIT
 */

package com.hexaTech.domain.port.in;

import java.io.IOException;

/**
 * AddBDL input interface.
 */
public interface AddBDLInputPort {

    /**
     * Loads a new BDL.
     * @throws IOException if an error occurs during loading process.
     * @param document
     */
    void addBDL(String document) throws IOException;

    void checkIfRepoBDLIsEmpty();

}//AddBDLInputPort
