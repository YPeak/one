$params$：groovyScript("if(\"${_1}\".length() == 2) {return '';} else {def result=''; def params=\"${_1}\".replaceAll('[\\\\[|\\\\]|\\\\s]', '').split(',').toList();for(i = 0; i < params.size(); i++) {if(i<(params.size()-1)){result+=' * @param ' + params[i] + ' : ' + '\\n'}else{result+=' * @param ' + params[i] + ' : '}}; return result;}", methodParameters());
$return$：groovyScript("def returnType = \"${_1}\"; def result = ' * @return : ' + returnType; return result;", methodReturnType());

**
 * @Description:
 * @Author: shuWei.yu
 * @date: $date$
$params$
$return$
*/

/**
 * @Description: $discription$
 * @Author: shuWei.yu
 * @date: $date$
*/


缩略图插件：CodeGlance  可在官网下载

生成pdf
filter
代理
分布式
网关