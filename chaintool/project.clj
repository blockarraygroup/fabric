;;
;; Copyright Greg Haskins All Rights Reserved
;;
;; SPDX-License-Identifier: Apache-2.0
;;

(defproject chaintool "1.0.2-SNAPSHOT"
  :description "Hyperledger Fabric chaincode tool"
  :url "https://github.com/hyperledger/fabric-chaintool"
  :license {:name "Apache License"
            :url "http://www.apache.org/licenses/LICENSE-2.0.txt"}
  :min-lein-version "2.0.0"
  :lein-release {:deploy-via :shell :shell ["true"]}
  :javac-options ["-target" "1.8" "-source" "1.8"]
  :jvm-opts ["-server"]
  :java-source-paths ["src"]
  :plugins [[lein-bin "0.3.5"]
            [lein-licenses "0.2.1"]]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.cli "0.3.5"]
                 [org.clojure/algo.generic "0.1.2"]
                 [org.clojure/data.codec "0.1.0"]
                 [instaparse "1.4.7"]
                 [clojure-tools "1.1.3"]
                 [org.antlr/ST4 "4.0.8"]
                 [me.raynes/conch "0.8.0"]
                 [me.raynes/fs "1.4.6"]
                 [org.clojars.ghaskins/protobuf "3.4.0-1"]
                 [commons-io/commons-io "2.5"]
                 [org.tukaani/xz "1.6"]
                 [org.apache.commons/commons-compress "1.14"]
                 [com.github.jponge/lzma-java "1.3"]
                 [pandect "0.5.4"]
                 [doric "0.9.0"]
                 [circleci/clj-yaml "0.5.6"]
                 [slingshot "0.12.2"]
                 [clj-http "3.7.0"]
                 [cheshire "5.8.0"]]
  :main ^:skip-aot chaintool.core
  :bin {:name "chaintool"
        :bin-path "target"
        :bootclasspath true}
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
