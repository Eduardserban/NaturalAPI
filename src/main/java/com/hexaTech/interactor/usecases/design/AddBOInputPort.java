package com.hexaTech.interactor.usecases.design;

import java.io.IOException;

public interface AddBOInputPort {

    void addBO(String directory, String document) throws IOException;
}