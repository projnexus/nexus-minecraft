package cc.projectnexus.integrations.nexusmc;

import cc.projectnexus.adapters.java.NexusClient;
import cc.projectnexus.adapters.java.NexusClientProperties;
import org.bukkit.Bukkit;

public class NexusImpl extends NexusClient {
	public NexusImpl() {
		super(new NexusClientProperties(false, "", false));
	}

	@Override
	public void onAuthorizeSuccess() {
		Bukkit.getLogger().info("Connected to Nexus API.");
	}

	@Override
	public void onAuthorizeFail() {

	}
}
