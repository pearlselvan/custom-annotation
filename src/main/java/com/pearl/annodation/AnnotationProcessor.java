package com.pearl.annodation;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import javax.lang.model.SourceVersion;
import java.util.Set;

//@SupportedAnnotationTypes({"com.pearl.annodation.MobileTest"})
@SupportedAnnotationTypes( "*" )
public class AnnotationProcessor extends AbstractProcessor {
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        Messager messager = processingEnv.getMessager();

        AppiumRunner appiumRunner = new AppiumRunner();


        for (TypeElement te : annotations) {
            for (Element e : roundEnv.getElementsAnnotatedWith(te)) {

                messager.printMessage(Diagnostic.Kind.NOTE, "Printing: " + e.toString());

                te = findEnclosingTypeElement(e);
                System.out.println(te.getQualifiedName());

                MobileTest tagAnnotation = te.getAnnotation(MobileTest.class);
                System.out.println(tagAnnotation.name());
                appiumRunner.setMobileName(tagAnnotation.name());








            }

        }
        return true;
    }

    public static TypeElement findEnclosingTypeElement( Element e ) {
        while (e != null && !(e instanceof TypeElement)) {
            e = e.getEnclosingElement();
        }
        return TypeElement.class.cast(e);
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latestSupported();
    }
}

