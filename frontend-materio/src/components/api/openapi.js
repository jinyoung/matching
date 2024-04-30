import projectYaml from "./project-openapi.yaml";
import contractYaml from "./contract-openapi.yaml";
import YAML from "json2yaml";

let apiSpec = "";

let projectSpec = YAML.stringify(projectYaml);
apiSpec += projectSpec;

let contractSpec = YAML.stringify(contractYaml);
apiSpec += contractSpec;


export default apiSpec;