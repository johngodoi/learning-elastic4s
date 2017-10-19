import org.codelibs.elasticsearch.runner.ElasticsearchClusterRunner
import org.codelibs.elasticsearch.runner.ElasticsearchClusterRunner._
import org.elasticsearch.common.settings.Settings

object ElasticsearchLauncher extends App {

  // create runner instance
  val runner = new ElasticsearchClusterRunner();
  // create ES nodes
  runner.onBuild(new ElasticsearchClusterRunner.Builder() {
    override def build(index: Int, settingsBuilder: Settings.Builder) = {
      // put elasticsearch settings
      // settingsBuilder.put("index.number_of_replicas", 0);
    }
  }).build(newConfigs());
}
