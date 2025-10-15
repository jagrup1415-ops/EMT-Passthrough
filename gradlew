#!/usr/bin/env sh
DIR="$(cd "$(dirname "$0")" && pwd)"
JAVA_OPTS="$JAVA_OPTS -Xmx2g"
exec "$DIR/gradle/bin/gradle" "$@"
