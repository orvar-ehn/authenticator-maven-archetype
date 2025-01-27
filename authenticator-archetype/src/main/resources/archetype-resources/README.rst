${pluginName} Authenticator Plugin
=============================================

A custom authenticator plugin for the Curity Identity Server.

Building the Plugin
~~~~~~~~~~~~~~~~~~~

Ensure that you have obtain credentials for the Curity Nexus server, so that the SDK can be downloaded during compilation. If you do not have a credential, open a ticket in the `Curity Developer Portal <https://developer.curity.io/>`_. Once you have the credential, ensure that it is `configured in your Maven settings <https://developer.curity.io/docs/latest/developer-guide/plugins/index.html#access-to-the-curity-release-repository>`_. Then, build the plugin by issue the command ``mvn package``. This will produce a JAR file in the ``target`` directory, which can be installed.

Installing the Plugin
~~~~~~~~~~~~~~~~~~~~~

To install the plugin, copy the compiled JAR (and all of its dependencies) into the :file:`${IDSVR_HOME}/usr/share/plugins/${pluginGroup}` on each node, including the admin node. For more information about installing plugins, refer to the `curity.io/plugins`_.

Required Dependencies
"""""""""""""""""""""

For a list of the dependencies and their versions, run ``mvn dependency:list``. Ensure that all of these are installed in the plugin group; otherwise, they will not be accessible to this plug-in and run-time errors will result.

More Information
~~~~~~~~~~~~~~~~

Please visit `curity.io`_ for more information about the Curity Identity Server.

.. _curity.io/plugins: https://support.curity.io/docs/latest/developer-guide/plugins/index.html#plugin-installation
.. _curity.io: https://curity.io/
