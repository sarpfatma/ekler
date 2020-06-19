# EKLER

## Türkçe ekleri için java kütüphanesi

### Ornek kullanimlar

```java
public class UseExample {

    public static void main(String[] args) {

       // Ornek iyelik eki kullanimi
       String name = "Fatma";
       Ekler myNameSuffixes = new Ekler(name);
       System.out.println("Iyelik Eki: " + name + "'" + myNameSuffixes.iyelik());

       // Ornek sahiplik eki kullanimi
       String objectName = "silgi";
       Ekler myobjectNameSuffixes = new Ekler(objectName);
       System.out.println("sahiplik Eki: " + objectName + myobjectNameSuffixes.sahiplik());

       // Ornek master eki kullanimi
       String verb = "anla";
       Ekler myVerbSuffixes = new Ekler(verb);
       System.out.println("mastar Eki: " + verb + myVerbSuffixes.mastar());
    }
}
```
