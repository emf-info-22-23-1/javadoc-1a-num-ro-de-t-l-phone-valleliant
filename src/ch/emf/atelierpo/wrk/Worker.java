package ch.emf.atelierpo.wrk;


/**
 * Vérifie si le numéro de téléphone mobile fourni est valide selon les préfixes standards suisses.
 * Un numéro de téléphone mobile est considéré comme valide si le préfixe est l'un des suivants: +4176, +4177, +4178, ou +4179.
 * De plus, le numéro ne doit contenir que des chiffres de 0 à 9 et des espaces.
 * 
 * @param prefix Le préfixe du numéro de téléphone mobile, attendu avec le format international (ex: +4177).
 * @param numero Le reste du numéro de téléphone mobile, qui peut inclure des espaces mais pas d'autres caractères (ex: "744 92 31").
 * @return true si le numéro de téléphone mobile est valide avec le bon préfixe et contient uniquement les caractères autorisés;
 * si un de ces critères n'est pas respecté, il faut rentourner false.
 * 
 * Exemples:
 * - controleNumeroTelMobile("+4177", "744 92 31") retourne true
 * - controleNumeroTelMobile("+4171", "798 76 67") retourne false
 * - controleNumeroTelMobile("+4176", "7973331") retourne false
 * - controleNumeroTelMobile("079", "733.12.33") retourne false
 */
public class Worker {

    public boolean controleNumeroTelMobile(String prefix, String numero) {
        return false;
    }

}
