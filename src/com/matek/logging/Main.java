package com.matek.logging;

//import java.util.logging.Logger;

import org.apache.log4j.Logger;
public class Main {

    final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        logger.trace("Trace");
        logger.debug("Debug");
        logger.info("Info");
        logger.error("Error");
        logger.fatal("Fatal");
        logger.warn("Warn");


        // Davalebebi:
        // exceptionebit da logebit ramis sheqmna
        //
        // reflectionebit da anotaciebit rame aplikaciis sheqmnda

    }

}
