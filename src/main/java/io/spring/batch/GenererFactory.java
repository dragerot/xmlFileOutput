package io.spring.batch;

import iso.std.iso._20022.tech.xsd.pain_001_001.Document;

/**
 * Created by toregard on 21.09.2016.
 */
public class GenererFactory {
    Document document;

    public Document createDocument(){
        document = new Document();

        return document;
    }
}
