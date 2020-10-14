package Dominio;

import Dominio.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-13T19:07:37")
@StaticMetamodel(Facturacion.class)
public class Facturacion_ { 

    public static volatile SingularAttribute<Facturacion, Integer> facnId;
    public static volatile SingularAttribute<Facturacion, String> facState;
    public static volatile SingularAttribute<Facturacion, String> facCity;
    public static volatile SingularAttribute<Facturacion, String> facAddress;
    public static volatile SingularAttribute<Facturacion, String> facName;
    public static volatile SingularAttribute<Facturacion, String> facZip;
    public static volatile SingularAttribute<Facturacion, Usuarios> userId;

}