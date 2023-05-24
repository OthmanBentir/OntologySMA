package sma;

import jade.core.ProfileImpl;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.StaleProxyException;

import jade.core.Runtime;




public class AgentsContainer {
    public static void main(String[] args) throws StaleProxyException {
        Runtime instance = Runtime.instance();
        ProfileImpl profile=new ProfileImpl();
        profile.setParameter(ProfileImpl.MAIN_HOST,"localhost");
        AgentContainer agentContainer=instance.createAgentContainer(profile);
        AgentController agentSeller=agentContainer.createNewAgent("seller","sma.SellerAgent",new Object[]{});
        AgentController agentBuyer=agentContainer.createNewAgent("buyer","sma.BuyerAgent",new Object[]{});
        agentSeller.start();
        agentBuyer.start();

    }
}
