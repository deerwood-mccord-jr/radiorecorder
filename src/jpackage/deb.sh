VERSION=$(mvn org.apache.maven.plugins:maven-help-plugin:3.1.0:evaluate -Dexpression=project.version -q -DforceStdout)

jpackage \
--name radiorecorder \
--type deb \
--app-version ${VERSION} \
--copyright "Stephan Fuhrmann" \
--description "Records and plays internet radio streams" \
--main-jar lib/radiorecorder-${VERSION}.jar \
--main-class de.sfuhrm.radiorecorder.Main \
--license-file LICENSE \
--input target/radiorecorder-${VERSION}-app/radiorecorder-${VERSION} \
--linux-deb-maintainer s@sfuhrm.de \
--linux-shortcut
