public class GeoPoliticalZone {

    public String getStateWith(String state) {
        for (Zones zones : Zones.values()) {
            for(String states: zones.getStateName()) {
                if(states.equals(state)) {
                    return zones.toString();
                }
            }
        }
        return null;
    }
}
