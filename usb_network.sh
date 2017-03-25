#!/bin/bash

python simple-dhcpd -a 10.41.27.1 -i enp0s29u1u2 -f 10.41.27.2 -t 10.41.27.2 &

watch -n30 'ip addr add 10.41.27.1/24 dev enp0s29u1u2'
